package com.example.biletick;

import java.io.Serializable;

public class User implements Serializable {


    // поля сущности
    private String Idname;
    private String deport;
    private String arrival;
    private String timeDeport;
    private String timeArrival;
    private String cost;

    //  геттеры и сеттеры

    public String getIdname() {
        return Idname;
    }

    public void setIdname(String idname) {
        Idname = idname;
    }

    public String getDeport() {
        return deport;
    }

    public void setDeport(String deport) {
        this.deport = deport;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getTimeDeport() {
        return timeDeport;
    }

    public void setTimeDeport(String timeDeport) {
        this.timeDeport = timeDeport;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    // необходимый конструктор
    public User(String Idname, String deport, String arrival, String timeDeport, String timeArrival, String cost) {
        this.Idname = Idname;
        this.deport = deport;
        this.arrival = arrival;
        this.timeDeport = timeDeport;
        this.timeArrival = timeArrival;
        this.cost = cost;

    }
}

