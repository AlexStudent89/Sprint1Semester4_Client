package com.keyin.domain;


import java.util.List;
import java.util.Objects;

public class City {
    private Long id;
    private String name;
    private String province;
    private int population;

    private List<Airport> airports;
    private List<Passenger> passengers;

    // The Constructors
    public City(long l, String s, String nlProvince, int i, Object o, Object object) {
    }

    public City(Long id, String name, String province, int population, List<Airport> airports, List<Passenger> passengers) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.population = population;
        this.airports = airports;
        this.passengers = passengers;
    }

    public City() {
    }

    // G and S
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    // toString(), equals() and hashCode() methods are recommended for proper collection and debugging usage
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", population=" + population +
                ", airports=" + airports +
                ", passengers=" + passengers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population && id.equals(city.id) && name.equals(city.name) && province.equals(city.province) && Objects.equals(airports, city.airports) && Objects.equals(passengers, city.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, province, population, airports, passengers);
    }

}
