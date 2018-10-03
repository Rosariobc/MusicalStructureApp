package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    public static final String KEY_ARTIST = "KEY_ARTIST";
    public static final String KEY_SONGS = "KEY_SONGS";
    public static final String KEY_REGIONS = "KEY_REGIONS";
    public static final int imageResourceId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_list);

        // This method creates the Songs arrayList

        final ArrayList<Songs> songs = new ArrayList<Songs>();

        //regions.add("artist", "songs", image) in order to fill the ArrayList
        songs.add(new Songs("Carlos Vives", "Clasicos de la Provincia", "Caribe", R.drawable.song_vives_clasicosprovincia));
        songs.add(new Songs("Shakira", "El Dorado", "Caribe", R.drawable.song_shakira_eldorado));
        songs.add(new Songs("Naty Botero", "Siempre juntos", "Centro", R.drawable.song_botero_timbiqui_siemprejuntos));
        songs.add(new Songs("Fonseca", "Sinfonico", "Centro", R.drawable.song_fonseca_sinfonico));
        songs.add(new Songs("Palo de Agua", "A tiempo", "Centro", R.drawable.song_palodeagua_atiempo));
        songs.add(new Songs("Cepeda", "El carpintero", "Centro", R.drawable.song_cepeda_elcarpintero));
        songs.add(new Songs("herencia de timbiqui", "herencia", "Pacifico", R.drawable.song_timbiqui_herencia));
        songs.add(new Songs("Cholo valderrama", "sencillamente llano", "Llanos", R.drawable.song_cholo_sencillamentellano));
        songs.add(new Songs("Chockibtown", "Eso es lo que hay", "Pacifico", R.drawable.song_chocquibtown_esoesloquehay));
        songs.add(new Songs("Fanny Lu", "dos", "Caribe", R.drawable.song_fannylu_dos));
        songs.add(new Songs("Carlos Vives & Shakira", "La Bicicleta", "Caribe", R.drawable.song_vives_shakira_labicicleta));
        songs.add(new Songs("cabas", "bonita", "Centro", R.drawable.song_cabas_bonita));
        songs.add(new Songs("Palo de agua", "Son Caribeño", "Centro", R.drawable.song_palodeagua_caribeno));
        songs.add(new Songs("Naty Botero", "la lengua", "Centro", R.drawable.song_naty_lalengua));
        songs.add(new Songs("Cholo valderrama", "huella de tu recuerdo", "Llanos", R.drawable.song_cholo_huelladeturecuerdo));
        songs.add(new Songs("Fonseca", "cancion 1", "Caribe", R.drawable.song_fonseca_gratitud));
        songs.add(new Songs("Herencia de Timbiqui", "this is gozar", "Pacifico", R.drawable.song_timbiqui_thisisgozar));
        songs.add(new Songs("cabas", "puro cabas", "Centro", R.drawable.song_cabas_purocabas));
        songs.add(new Songs("juanes", "un dia normal", "Centro", R.drawable.song_juanes_undianormal));
        songs.add(new Songs("santiago cruz", "equilibrio", "Centro", R.drawable.song_cruz_equilibrio));
        songs.add(new Songs("Shakira", "Live From Paris", "Caribe", R.drawable.song_shakira_livefromparis));
        songs.add(new Songs("Carlos Vives", "El Rock de mi Pueblo", "Caribe", R.drawable.song_vives_elrockdemipueblo));
        songs.add(new Songs("santiago cruz", "cruce de caminos", "Centro", R.drawable.song_cruz_crucedecaminos));
        songs.add(new Songs("cepeda", "lo mejor que hay en mi vida", "Centro", R.drawable.song_cepeda_lomejorquehayenmivida));
        songs.add(new Songs("Chockibtown", "cuando te veo", "Pacifico", R.drawable.song_chockibtown_cuandoteveo));
        songs.add(new Songs("Fanny Lu", "llorar es una locura", "Caribe", R.drawable.song_fannylu_llorasesunalocura));

        final SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        // Organizing the ArrayList in a GridView
        final GridView songsGridView = (GridView) findViewById(R.id.list);
        songsGridView.setAdapter(songsAdapter);

        // setting an OnItemClickListener in order to move the clicked Item to inflate activity_play layout
        songsGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Songs item = (Songs) songsAdapter.getItem(position);
                Intent playingView = new Intent(getApplicationContext(), PlayActivity.class);
                playingView.putExtra(KEY_ARTIST, item.getArtistName());
                playingView.putExtra(KEY_SONGS, item.getSongsName());
                playingView.putExtra(KEY_REGIONS, item.getRegionsName());
                playingView.putExtra(String.valueOf(imageResourceId), item.getImageResourceId());
                startActivity(playingView);
            }

        });
    }
}
