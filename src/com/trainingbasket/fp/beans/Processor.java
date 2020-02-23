package com.trainingbasket.fp.beans;

public class Processor {
       private String generation;
       private String type;
       private String company;
       private  String clockSpeed;
       private  double cost;

    public Processor(String generation, String type, String company, String clockSpeed, double cost) {
        this.generation = generation;
        this.type = type;
        this.company = company;
        this.clockSpeed = clockSpeed;
        this.cost = cost;
    }

    public String getGeneration() {
        return generation;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public String getClockSpeed() {
        return clockSpeed;
    }

    public double getCost() {
        return cost;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setClockSpeed(String clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "generation='" + generation + '\'' +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", clockSpeed='" + clockSpeed + '\'' +
                ", cost=" + cost +
                '}';
    }
}
