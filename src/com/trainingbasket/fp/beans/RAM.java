package com.trainingbasket.fp.beans;

 class RAM {
   String speed;
   int cost;
   int chipSize;
   String ramId;

     public RAM(String speed, int cost, int chipSize, String ramId) {
         this.speed = speed;
         this.cost = cost;
         this.chipSize = chipSize;
         this.ramId = ramId;
     }

     public String getSpeed() {
         return speed;
     }

     public int getCost() {
         return cost;
     }

     public int getChipSize() {
         return chipSize;
     }

     public String getRamId() {
         return ramId;
     }

     public void setSpeed(String speed) {
         this.speed = speed;
     }

     public void setCost(int cost) {
         this.cost = cost;
     }

     public void setChipSize(int chipSize) {
         this.chipSize = chipSize;
     }

     public void setRamId(String ramId) {
         this.ramId = ramId;
     }

     @Override
     public String toString() {
         return "RAM{" +
                 "speed='" + speed + '\'' +
                 ", cost=" + cost +
                 ", chipSize=" + chipSize +
                 ", ramId='" + ramId + '\'' +
                 '}';
     }
 }
