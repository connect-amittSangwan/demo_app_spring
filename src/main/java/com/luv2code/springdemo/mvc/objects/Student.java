package com.luv2code.springdemo.mvc.objects;

import java.util.HashMap;
import java.util.LinkedHashMap;

//Created POJO Class to load data into the Model
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> cityOptions;
    private String favouriteLanguage;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    private String operatingSystem;

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public Student() {
        // Populating the city options from Constructor;
        cityOptions = new LinkedHashMap<String, String>();
        cityOptions.put("Rht", "Rohtak");
        cityOptions.put("Kr", "Karnal");
        cityOptions.put("Ch", "Chandigarh");
        cityOptions.put("Ddr", "Dadri");
        cityOptions.put("Jjh", "Jhajjar");
        cityOptions.put("Del", "Delhi");
        cityOptions.put("Mum", "Mumbai");
    }

    public LinkedHashMap<String, String> getCityOptions() {
        return cityOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}