/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Miguel Angel Rodriguez Carvajal
 */
public class Schedule {
    private int scheduleID;
    private String startSchedule;
    private String endSchedule;

    public Schedule() {
    }

    public Schedule(int scheduleID, String startSchedule, String endSchedule) {
        this.scheduleID = scheduleID;
        this.startSchedule = startSchedule;
        this.endSchedule = endSchedule;
    }

    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public String getStartSchedule() {
        return startSchedule;
    }

    public void setStartSchedule(String startSchedule) {
        this.startSchedule = startSchedule;
    }

    public String getEndSchedule() {
        return endSchedule;
    }

    public void setEndSchedule(String endSchedule) {
        this.endSchedule = endSchedule;
    }
    
    
}
