package com.example.demo.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class User {
    private int ID;
    private String Name;
    private String CountryCode;
    private String District;
    private int Population;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ID == user.ID && Population == user.Population && Objects.equals(Name, user.Name) && Objects.equals(CountryCode, user.CountryCode) && Objects.equals(District, user.District);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Name, CountryCode, District, Population);
    }
}
