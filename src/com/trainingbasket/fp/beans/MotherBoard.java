package com.trainingbasket.fp.beans;

public class MotherBoard {

   String overview;
   int cost;
   String motherboardId;

    public MotherBoard(String overview, int cost, String motherboardId) {
        this.overview = overview;
        this.cost = cost;
        this.motherboardId = motherboardId;
    }

    public String getOverview() {
        return overview;
    }

    public int getCost() {
        return cost;
    }

    public String getMotherboardId() {
        return motherboardId;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setMotherboardId(String motherboardId) {
        this.motherboardId = motherboardId;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "overview='" + overview + '\'' +
                ", cost=" + cost +
                ", motherboardId='" + motherboardId + '\'' +
                '}';
    }
}
