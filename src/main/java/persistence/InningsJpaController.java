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
import logic.Innings;
import persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author RYZEN
 */
public class InningsJpaController implements Serializable {

    public InningsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public InningsJpaController() {
        emf = Persistence.createEntityManagerFactory("my_persistence_unit");
    }
    
    public void create(Innings innings) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(innings);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Innings innings) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            innings = em.merge(innings);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = innings.getInningsID();
                if (findInnings(id) == null) {
                    throw new NonexistentEntityException("The innings with id " + id + " no longer exists.");
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
            Innings innings;
            try {
                innings = em.getReference(Innings.class, id);
                innings.getInningsID();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The innings with id " + id + " no longer exists.", enfe);
            }
            em.remove(innings);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Innings> findInningsEntities() {
        return findInningsEntities(true, -1, -1);
    }

    public List<Innings> findInningsEntities(int maxResults, int firstResult) {
        return findInningsEntities(false, maxResults, firstResult);
    }

    private List<Innings> findInningsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Innings.class));
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

    public Innings findInnings(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Innings.class, id);
        } finally {
            em.close();
        }
    }

    public int getInningsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Innings> rt = cq.from(Innings.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
