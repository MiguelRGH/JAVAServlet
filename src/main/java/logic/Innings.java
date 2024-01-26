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
public class Innings {
    private int inningsID;
    private Date inningDate;
    private String inningHour;
    private String treatment;

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
