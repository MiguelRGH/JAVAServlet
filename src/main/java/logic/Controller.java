/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import javax.persistence.Persistence;
import persistence.PersistenceController;

/**
 *
 * @author RYZEN
 */
public class Controller {
    
    PersistenceController persistControl = new PersistenceController();
    
    public void createUser (String userName, String password, String role){
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setRole(role);
        persistControl.createUser(user);
        
    }
}
