package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Images are from Colombian free to use libraries. No copyright.

        // This method opens the Regions list
        // Finding the View that shows the Songs activity
        TextView songs = (TextView) findViewById(R.id.songs_banner);

        // clickListener fo the songs View
        songs.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view){
                    // creating the new intent to open Songs activity
                    Intent intentOpenSongs = new Intent(MainActivity.this, SongsActivity.class);
                    startActivity(intentOpenSongs);
                }
            });

        // This method opens the Regions list
        // Finding the View that shows the Regions activity
        TextView regions = (TextView) findViewById(R.id.regions_banner);

        // clickListener fo the regions_banner View
        regions.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                // creating the new intent to open Regions activity
                Intent intentOpenRegions = new Intent(MainActivity.this, RegionsActivity.class);
                startActivity(intentOpenRegions);
            }
        });
    }

    }
