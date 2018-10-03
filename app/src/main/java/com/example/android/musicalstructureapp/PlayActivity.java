package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.musicalstructureapp.SongsActivity.*;


public class PlayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        String playingArtist = "";
        String playingSongs = "";
        String playingRegions = "";

        // Gets intents and view item data from SongsActivity
        Intent intent = getIntent();
        if (null != intent) {
            playingArtist = intent.getStringExtra(KEY_ARTIST);
            playingSongs = intent.getStringExtra(KEY_SONGS);
            playingRegions = intent.getStringExtra(KEY_REGIONS);
        }

        // Setting data to appropriate TextViews
        TextView playingArtistText = (TextView) findViewById(R.id.artist_name);
        playingArtistText.setText(playingArtist);

        TextView playingSongsText = (TextView) findViewById(R.id.songs_name);
        playingSongsText.setText(playingSongs);

        TextView playingRegionsText = (TextView) findViewById(R.id.regions_name);
        playingRegionsText.setText(playingRegions);

    }

    /**
     * // This method reflects the SeekBar status
     // Finding the View that shows the SeekBar
     **/
    //TODO method to show the advance of the song playing


    /**
     // This method reflects the playButton status
     // Finding the View that shows the playButton
     **/
    //TODO method for the play button


    /**
     // This method reflects the playButton status
     // Finding the View that shows the playButton
     **/
    //TODO method for the play button

}
