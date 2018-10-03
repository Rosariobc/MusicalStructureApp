package com.example.android.musicalstructureapp;

/**
// Regions new Class method
// Each object in this Class has 2 properties: regionsName and image resourceID
 **/

public class Regions {

    private String mRegionsName;

    // Drawable
    private int mImageResourceId;

    /**
     * Creating a new Regions object
     *
     * @param regionsName is the name of the region represented in the image
     * @param imageResourceId is the image to be included
     * */

    public Regions(String regionsName, int imageResourceId) {
        mRegionsName = regionsName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Getting the singer name
     */
    public String getRegionsName() {
        return mRegionsName;
    }

    /**
     * Getting the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}