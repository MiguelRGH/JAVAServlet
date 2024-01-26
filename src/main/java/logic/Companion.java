/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Date;

/**
 *
 * @author RYZEN
 */
public class Companion extends Person {
    private int companionID;
    private String relationship;

    public Companion() {
    }

    public Companion(int companionID, String relationship, String name, String lastName, String phoneNumber, String addres, Date bornDate) {
        super(name, lastName, phoneNumber, addres, bornDate);
        this.companionID = companionID;
        this.relationship = relationship;
    }

    public int getCompanionID() {
        return companionID;
    }

    public void setCompanionID(int companionID) {
        this.companionID = companionID;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    
    
}
