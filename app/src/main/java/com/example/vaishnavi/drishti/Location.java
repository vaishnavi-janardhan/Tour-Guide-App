package com.example.vaishnavi.drishti;

public class Location {
    private String mLocationName;
    private String mLocationDetails;
    private int mLocationImageResourceId;

    public Location(String locationName, String locationDetails, int locationImageResourceId) {
        mLocationName = locationName;
        mLocationDetails = locationDetails;
        mLocationImageResourceId = locationImageResourceId;
    }

    /* Get the name of the location */
    public String getLocationName() {
        return mLocationName;
    }

    /* Get the distance of the location */
    public String getLocationDetails() {
        return mLocationDetails;
    }

    public int getLocationImageResourceId() {
        return mLocationImageResourceId;
    }
}
