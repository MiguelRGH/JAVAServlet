/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Miguel Angel Rodriguez Carvajal
 */
public class Patient extends Person {
    private int patientID;
    private boolean privatePatient;
    private String bloodType;
    private Companion companion;
    private ArrayList<Innings> pateintsInnings;

    public Patient() {
    }

    public Patient(
            int patientID, 
            boolean privatePatient, 
            String bloodType, 
            Companion companion, 
            ArrayList<Innings> pateintsInnings, 
            String name, 
            String lastName, 
            String phoneNumber, 
            String addres, 
            Date bornDate) {
        super(name, lastName, phoneNumber, addres, bornDate);
        this.patientID = patientID;
        this.privatePatient = privatePatient;
        this.bloodType = bloodType;
        this.companion = companion;
        this.pateintsInnings = pateintsInnings;
    }

    public ArrayList<Innings> getPateintsInnings() {
        return pateintsInnings;
    }

    public void setPateintsInnings(ArrayList<Innings> pateintsInnings) {
        this.pateintsInnings = pateintsInnings;
    }
    
    public Companion getCompanion() {
        return companion;
    }

    public void setCompanion(Companion companion) {
        this.companion = companion;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public boolean isPrivatePatient() {
        return privatePatient;
    }

    public void setPrivatePatient(boolean privatePatient) {
        this.privatePatient = privatePatient;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
}
