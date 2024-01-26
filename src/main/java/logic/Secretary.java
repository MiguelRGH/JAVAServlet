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
public class Secretary extends Person {
    private int secretaryID;
    private String position;
    private String user;

    public Secretary() {
    }

    public Secretary(int secretaryID, String position, String user, String name, String lastName, String phoneNumber, String addres, Date bornDate) {
        super(name, lastName, phoneNumber, addres, bornDate);
        this.secretaryID = secretaryID;
        this.position = position;
        this.user = user;
    }

    public int getSecretaryID() {
        return secretaryID;
    }

    public void setSecretaryID(int secretaryID) {
        this.secretaryID = secretaryID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
}
