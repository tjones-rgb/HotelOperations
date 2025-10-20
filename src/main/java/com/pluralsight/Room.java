package com.pluralsight;

public class Room {
  int  numberOfBeds;
   double price;
   boolean isOccupied;
   boolean isDirty;
    boolean isAvailable;


    public int getnumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isAvailable && !isDirty;
    }
    public void setnumberOfBeds(int numberOfBeds){
        this.numberOfBeds = numberOfBeds;
    }
    public void setPrice(double price){
        this.price = price;
    }
   public void setOccupied(boolean occupied){
        this.isOccupied = occupied;
   }
   public void setDirty(boolean dirty){
        this.isDirty = dirty;
   }
}
