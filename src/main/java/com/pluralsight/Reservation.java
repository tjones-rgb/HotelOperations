package com.pluralsight;

public class Reservation {
 private String roomType;
 private double price;
 private int numberOfNights;
private boolean isWeekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;

        if (roomType.equals("king")){
            this.price = 139.00;
        } else if (roomType.equals("double")) {
            this.price = 124.00;
        }
        if (this.isWeekend){
            this.price =this.price * 1.10;
        }
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
        if (roomType.equals("king")){
            this.price = 139.00;
        } else if (roomType.equals("double")) {
            this.price = 124.00;
        }
        if (this.isWeekend){
            this.price = this.price * numberOfNights;
        }
    }
    public double getReservationTotal() {
       return price * numberOfNights;

    }
}
