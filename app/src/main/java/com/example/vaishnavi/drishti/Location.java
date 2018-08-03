package com.example.vaishnavi.drishti;

public class Location {
    private String locationName;
    private String locationDetails;
    private int locationImageResourceId;

    public Location(String locationName, String locationDetails, int locationImageResourceId) {
        this.locationName = locationName;
        this.locationDetails = locationDetails;
        this.locationImageResourceId = locationImageResourceId;
    }

    /* Get the name of the location */
    public String getLocationName() {
        return locationName;
    }

    /* Get the distance of the location */
    public String getLocationDetails() {
        return locationDetails;
    }

    public int getLocationImageResourceId() {
        return locationImageResourceId;
    }
}
