package com.keyin.domain;

import java.util.List;

public class Passenger {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Long cityId;

    public Passenger() {}

    public Passenger(Long id, String firstName, String lastName, String phoneNumber, Long cityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cityId = cityId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public Long getCityId() { return cityId; }
    public void setCityId(Long cityId) { this.cityId = cityId; }

    public Object getCity() {
        return null;
    }

    public Object getAircraftList() {
        return null;
    }

    public void setCity(City city) {
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
    }
}

