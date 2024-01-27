/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author RYZEN
 */

@Entity
public class Secretary extends Person {
    //private int secretaryID;
    private String position;
    @OneToOne
    private User user;

    public Secretary() {
    }

    public Secretary(String position, User user, int id, String name, String lastName, String phoneNumber, String addres, Date bornDate) {
        super(id, name, lastName, phoneNumber, addres, bornDate);
        this.position = position;
        this.user = user;
    }
   
    /*
    public int getSecretaryID() {
        return secretaryID;
    }

    public void setSecretaryID(int secretaryID) {
        this.secretaryID = secretaryID;
    }*/

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
