package com.adpro.seat;

public class Seat {
    private boolean isBooked;
    int seatNumber;

    public Seat(boolean isBooked, int seatNumber) {
        this.isBooked = isBooked;
        this.seatNumber = seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void booked() {
        this.isBooked = true;
    }

    public void unbooked() {
        this.isBooked = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

}
