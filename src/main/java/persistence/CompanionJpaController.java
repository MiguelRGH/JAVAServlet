/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logic.Companion;
import persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author RYZEN
 */
public class CompanionJpaController implements Serializable {

    public CompanionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public CompanionJpaController() {
        emf = Persistence.createEntityManagerFactory("my_persistence_unit");
    }
    
    public void create(Companion companion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(companion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Companion companion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            companion = em.merge(companion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = companion.getId();
                if (findCompanion(id) == null) {
                    throw new NonexistentEntityException("The companion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Companion companion;
            try {
                companion = em.getReference(Companion.class, id);
                companion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The companion with id " + id + " no longer exists.", enfe);
            }
            em.remove(companion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Companion> findCompanionEntities() {
        return findCompanionEntities(true, -1, -1);
    }

    public List<Companion> findCompanionEntities(int maxResults, int firstResult) {
        return findCompanionEntities(false, maxResults, firstResult);
    }

    private List<Companion> findCompanionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Companion.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Companion findCompanion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Companion.class, id);
        } finally {
            em.close();
        }
    }

    public int getCompanionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Companion> rt = cq.from(Companion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
