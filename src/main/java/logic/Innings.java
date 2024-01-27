/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author RYZEN
 */

@Entity
public class Innings implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int inningsID;
    @Temporal(TemporalType.DATE)
    private Date inningDate;
    private String inningHour;
    private String treatment;
    @ManyToOne
    @JoinColumn (name = "inningsID")
    private Doctor doc;
    @ManyToOne
    @JoinColumn (name = "inningsID2")
    private Patient pat;
    
    public Innings() {
    }

    public Innings(int inningsID, Date inningDate, String inningHour, String treatment) {
        this.inningsID = inningsID;
        this.inningDate = inningDate;
        this.inningHour = inningHour;
        this.treatment = treatment;
    }

    public int getInningsID() {
        return inningsID;
    }

    public void setInningsID(int inningsID) {
        this.inningsID = inningsID;
    }

    public Date getInningDate() {
        return inningDate;
    }

    public void setInningDate(Date inningDate) {
        this.inningDate = inningDate;
    }

    public String getInningHour() {
        return inningHour;
    }

    public void setInningHour(String inningHour) {
        this.inningHour = inningHour;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    
    
}
