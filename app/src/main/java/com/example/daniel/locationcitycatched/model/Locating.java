package com.example.daniel.locationcitycatched.model;

/**
 * Created by Daniel on 13/5/16.
 */
public class Locating {

    Double latitude;
    Double longitude;


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

    public Locating(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
