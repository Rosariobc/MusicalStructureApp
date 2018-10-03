package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RegionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // This method creates the Regions arrayList

        ArrayList<Regions> regions = new ArrayList<Regions>();

        //regions.add("region", image) in order to fill the ArrayList
        regions.add(new Regions("Caribe", R.drawable.region_caribe0));
        regions.add(new Regions("Pacifico", R.drawable.region_pacifico1));
        regions.add(new Regions("Centro", R.drawable.region_centro3));
        regions.add(new Regions("Amazonia", R.drawable.region_amazonias1));
        regions.add(new Regions("Llanos", R.drawable.region_llanos1));
        regions.add(new Regions("Caribe", R.drawable.region_caribe1));
        regions.add(new Regions("Pacifico", R.drawable.region_pacifico2));
        regions.add(new Regions("Centro", R.drawable.region_centro0));
        regions.add(new Regions("Llanos", R.drawable.region_llanos2));
        regions.add(new Regions("Caribe", R.drawable.region_caribe2));
        regions.add(new Regions("Caribe", R.drawable.region_caribe3));
        regions.add(new Regions("Pacifico", R.drawable.region_pacifico3));
        regions.add(new Regions("Centro", R.drawable.region_centro1));
        regions.add(new Regions("Amazonia", R.drawable.region_amazonias2));
        regions.add(new Regions("Llanos", R.drawable.region_llanos3));
        regions.add(new Regions("Caribe", R.drawable.region_caribe4));
        regions.add(new Regions("Caribe", R.drawable.region_caribe5));
        regions.add(new Regions("Pacifico", R.drawable.region_pacifico4));
        regions.add(new Regions("Llanos", R.drawable.region_llanos4));
        regions.add(new Regions("Caribe", R.drawable.region_caribe6));
        regions.add(new Regions("Pacifico", R.drawable.region_pacifico5));
        regions.add(new Regions("Centro", R.drawable.region_centro2));
        regions.add(new Regions("Amazonia", R.drawable.region_amazonias3));
        regions.add(new Regions("Llanos", R.drawable.region_llanos5));
        regions.add(new Regions("Caribe", R.drawable.region_caribe7));
        regions.add(new Regions("Pacifico", R.drawable.region_pacifico6));
        regions.add(new Regions("Centro", R.drawable.region_centro4));
        regions.add(new Regions("Llanos", R.drawable.region_llanos6));

        RegionsAdapter adapter = new RegionsAdapter(this, regions);

        ListView listView = (ListView) findViewById(R.id.list_r);

        listView.setAdapter(adapter);

    }
}
