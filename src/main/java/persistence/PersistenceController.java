/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import logic.User;

/**
 *
 * @author RYZEN
 */
public class PersistenceController {
    
    CompanionJpaController companionJpa = new CompanionJpaController();
    DoctorJpaController doctorJpa = new DoctorJpaController();
    InningsJpaController inningJpa = new InningsJpaController();
    PatientJpaController patientJpa = new PatientJpaController();
    PersonJpaController personJpa = new PersonJpaController();
    ScheduleJpaController scheduleJpa = new ScheduleJpaController();
    SecretaryJpaController secreatryJpa = new SecretaryJpaController();
    UserJpaController userJpa = new UserJpaController();

    public PersistenceController() {
    }
       
    public void createUser(User user) {
        userJpa.create(user);
    }
            
}
