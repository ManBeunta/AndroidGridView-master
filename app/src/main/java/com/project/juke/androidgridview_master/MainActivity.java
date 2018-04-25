package com.project.juke.androidgridview_master;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView GvItem;
    ArrayList<ItemGrid> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GvItem = findViewById(R.id.GvItem);
        arrayList.add(new ItemGrid("Pertama", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Kedua", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Ketiga", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Keempat", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Kelima", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Keenam", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Ketujuh", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Kedelapan", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Kesembilan", R.mipmap.ic_launcher));
        arrayList.add(new ItemGrid("Kesepuluh", R.mipmap.ic_launcher));

        AdapterGrid adapterGrid = new AdapterGrid(this, R.layout.list_grid, arrayList);
        GvItem.setAdapter(adapterGrid);
    }
}
