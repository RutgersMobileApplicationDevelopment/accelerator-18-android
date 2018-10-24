package com.rumad.week1app.model;

import java.io.Serializable;

public class Profile implements Serializable {

    String firstName;
    String lastName;

    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
