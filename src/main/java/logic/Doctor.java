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
public class Doctor extends Person {
    private int doctorId;
    private String Specialty;
    private ArrayList<Innings> doctorsInnings;
    private String User;
    private String Schedule;

    public Doctor() {
    }

    public Doctor(
            int doctorId, 
            String Specialty, 
            ArrayList<Innings> doctorsInnings, 
            String User, 
            String Schedule, 
            String name, 
            String lastName, 
            String phoneNumber, 
            String addres, 
            Date bornDate) {
        super(name, lastName, phoneNumber, addres, bornDate);
        this.doctorId = doctorId;
        this.Specialty = Specialty;
        this.doctorsInnings = doctorsInnings;
        this.User = User;
        this.Schedule = Schedule;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }

    public ArrayList<Innings> getDoctorsInnings() {
        return doctorsInnings;
    }

    public void setDoctorsInnings(ArrayList<Innings> doctorsInnings) {
        this.doctorsInnings = doctorsInnings;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }
    
    
}
