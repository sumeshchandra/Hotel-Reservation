package com.hotelReservation;

public class Hotel {
    public String hotelName;
    public int dailyRate;

    /**
     * this one is a parameterised constructor which will initiate the value.
     * @param hotelName
     * @param dailyRate
     */
    public Hotel(String hotelName, int dailyRate) {
        this.hotelName = hotelName;
        this.dailyRate = dailyRate;
    }

    /**
     * here i have used getter and setter method
     */
    
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int regularCustomerRate) {
        this.dailyRate = regularCustomerRate;
    }

    /**
     * here i have added welcome message.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
    }
}
