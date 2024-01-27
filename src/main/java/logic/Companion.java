/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author RYZEN
 */

@Entity
public class Companion extends Person implements Serializable {
    //private int companionID;
    private String relationship;

    public Companion() {
    }

    public Companion(String relationship, int id, String name, String lastName, String phoneNumber, String addres, Date bornDate) {
        super(id, name, lastName, phoneNumber, addres, bornDate);
        this.relationship = relationship;
    }

    /*
    public int getCompanionID() {
        return companionID;
    }

    public void setCompanionID(int companionID) {
        this.companionID = companionID;
    }*/

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    
    
}
