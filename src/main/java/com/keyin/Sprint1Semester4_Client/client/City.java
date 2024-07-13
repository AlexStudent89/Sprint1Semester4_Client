package com.keyin.Sprint1Semester4_Client.client;

public class City {
    private Long id;
    private String name;
    private String state;
    private int population;

    // Constructors, getters, and setters

    public City() {
    }

    public City(Long id, String name, String province, int population, List<Airport> airports, List<Passenger> passengers) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.population = population;
        this.airports = airports;
        this.passengers = passengers;
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

    // toString(), equals() та hashCode()
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
        return population == city.population && id.equals(city.id) && name.equals(city.name) && province.equals(city.province) && airports.equals(city.airports) && passengers.equals(city.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, province, population, airports, passengers);
    }
}