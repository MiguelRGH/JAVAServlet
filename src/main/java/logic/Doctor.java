/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Miguel Angel Rodriguez Carvajal
 */

@Entity
public class Doctor extends Person implements Serializable {
    //private int doctorId;
    private String specialty;
    @OneToMany (mappedBy = "doc")
    private ArrayList<Innings> doctorsInnings;
    @OneToOne
    private User user;
    @OneToOne
    private Schedule schedule;
    
    public Doctor() {
    }

    public Doctor(String specialty, ArrayList<Innings> doctorsInnings, User user, Schedule schedule, int id, String name, String lastName, String phoneNumber, String addres, Date bornDate) {
        super(id, name, lastName, phoneNumber, addres, bornDate);
        this.specialty = specialty;
        this.doctorsInnings = doctorsInnings;
        this.user = user;
        this.schedule = schedule;
    }

    /*
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }*/

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String Specialty) {
        this.specialty = Specialty;
    }

    public ArrayList<Innings> getDoctorsInnings() {
        return doctorsInnings;
    }

    public void setDoctorsInnings(ArrayList<Innings> doctorsInnings) {
        this.doctorsInnings = doctorsInnings;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    
}
