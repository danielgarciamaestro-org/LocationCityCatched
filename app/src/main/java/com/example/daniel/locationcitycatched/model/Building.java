package com.example.daniel.locationcitycatched.model;

/**
 * Created by Daniel on 12/5/16.
 */
public class Building {

    String description;
    String name;
    Double latitude;
    Double longitude;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Building(String description, String name, Double latitude, Double longitude) {
        this.description = description;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
