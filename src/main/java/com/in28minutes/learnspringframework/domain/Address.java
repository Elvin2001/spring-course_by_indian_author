package com.in28minutes.learnspringframework.domain;

public class Address {
    private String countryName;
    private String cityName;
    private String streetName;
    private double houseNumber;

    public Address(String countryName, String cityName, String streetName, double houseNumber) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public double getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "countryName='" + countryName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
