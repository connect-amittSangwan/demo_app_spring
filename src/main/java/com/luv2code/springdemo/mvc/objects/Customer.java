package com.luv2code.springdemo.mvc.objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    @NotNull
    @Size(min = 4, message = "Min size is 4")
    private String firstName;

    @NotNull
    @Size(min = 4,max = 6)
    private String lastName;

    @NotNull
    private String profile;

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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}