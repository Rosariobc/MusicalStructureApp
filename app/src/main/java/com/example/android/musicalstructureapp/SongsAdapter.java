package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * SongsAdapter is an ArrayAdapter providing the layout for each list
 * based on a data source, which is a list of Songs objects.
 */

public class SongsAdapter extends ArrayAdapter<Songs> {

    private static final String LOG_TAG = SongsAdapter.class.getSimpleName();

    /**
     * This is the custom constructor
     * The context is used to inflate the layout file, and the list is the data we want to populate into the lists
     *
     * @param context The current context. Used to inflate the layout file
     * @param songs A List of songs objects to display in a list
     */

    // Initialization of the ArrayAdapter's internal storage for the context and the list
    // the second argument is used when the ArrayAdapter is populating a single TextView
    // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
    // using this second argument, so the value will be 0
    public SongsAdapter(Activity context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    /**
     * view for an AdapterView: ListView
     *
     * @param position in the list of data to be displayed in the list item view
     * @param convertView recycled view to populate
     * @param parent ViewGroup used for inflation
     * @return View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_songs, parent, false);
        }

        // Getting the Songs object located at this position in the list
        Songs currentSongs = getItem(position);

        // Finding the TextView in the activity_songs.xml layout with the ID songs_name
        TextView nameSongsTextView = (TextView) listItemView.findViewById(R.id.songs_name);
        // Getting the version name from the current Songs Name object and setting this text on the name TextView
        if (currentSongs != null) {
            nameSongsTextView.setText(currentSongs.getSongsName());
        }

        // Finding the TextView in the activity_songs.xml layout with the ID artist_name
        TextView nameArtistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Getting the version name from the current Songs Artist object and setting this text on the name TextView
        if (currentSongs != null) {
            nameArtistTextView.setText(currentSongs.getArtistName());
        }

        // Finding the TextView in the activity_songs.xml layout with the ID regions_name
        TextView nameRegionsTextView = (TextView) listItemView.findViewById(R.id.regions_name);
        // Getting the version name from the current Songs Artist object and setting this text on the name TextView
        if (currentSongs != null) {
            nameRegionsTextView.setText(currentSongs.getRegionsName());
        }

        // Find the ImageView in the activity_songs.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Getting the image resource ID from the current Songs object and setting the image to iconView
        if (currentSongs != null) {
            iconView.setImageResource(currentSongs.getImageResourceId());
        }

        // Return the whole list item layout (containing 2 TextViews and an 1 ImageView) so that it can be shown in the ListView
        return listItemView;

    }
}