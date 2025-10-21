package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private boolean occupied, dirty;
    private double price;

    public Room(int numberOfBeds, boolean occupied, boolean dirty, double price) {
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isAvailable() {
        return (!this.dirty && !this.occupied);
    }
    public void checkIn(){
        if (isAvailable()){
            this.occupied = true;
            this.dirty = true;
            System.out.println("Room is in use");
        }else{
            System.out.println("Room is not avaliable");
        }
    }
    public  void checkOut(){
        if(this.occupied){
            this.occupied = false;
            this.dirty = true;
            System.out.println("Guest Checked out room needs to be cleaned");
        }else{
            System.out.println("Room is not occupied");
        }

    }public void cleanRoom(){
        if (this.dirty){
            this.dirty = false;
            System.out.println("Room has been cleaned");
        }else {
            System.out.println("Room is avabible");
        }
    }
}
