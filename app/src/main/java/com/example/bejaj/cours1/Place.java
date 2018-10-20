package com.example.bejaj.cours1;

public class Place {


    private int latitude;
    private int longitude;
    private String street;
    private String zipCode;
    private String city;

    public Place(int latitude, int longitude, String street, String zipCode, String city) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }
    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
