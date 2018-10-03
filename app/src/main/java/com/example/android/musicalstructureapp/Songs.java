package com.example.android.musicalstructureapp;

/**
 // Songs new Class method
 // Each object in this Class has 4 properties: songsName, artistName, regionsName and image resourceID
 **/

public class Songs {

    private String mArtistName;

    private String mSongsName;

    private String mRegionsName;

    // Drawable resource ID
    private int mImageResourceId;

    /**
     * Creating a new Songs object
     *
     * @param artistName is the name of the artist represented in the image
     * @param songsName is the name of the song to be played
     * @param regionsName is the name of the song to be played
     * @param imageResourceId is the image to be included
     * */

    public Songs(String artistName, String songsName, String regionsName, int imageResourceId) {
        mArtistName = artistName;
        mSongsName = songsName;
        mRegionsName = regionsName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Getting the singer name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Getting the song name
     */
    public String getSongsName() {
        return mSongsName;
    }

    /**
     * Getting the regions name
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