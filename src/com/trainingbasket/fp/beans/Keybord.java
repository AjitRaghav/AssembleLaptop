package com.trainingbasket.fp.beans;

public class Keybord {
    private String type;
    private  String color;
    private double weight;
    private  int battery;
    private int cost;

    public Keybord(String type, String color, double weight, int battery, int cost) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.battery = battery;
        this.cost = cost;
    }

    public Keybord(String type, String color, double weight, int cost) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getBattery() {
        return battery;
    }

    public int getCost() {
        return cost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Keybord{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", battery=" + battery +
                ", cost=" + cost +
                '}';
    }
}



