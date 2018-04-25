package com.project.juke.androidgridview_master;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterGrid extends ArrayAdapter<ItemGrid> {

    ArrayList<ItemGrid> arrayList = new ArrayList<>();

    public AdapterGrid(Context context, int textViewResourceId, ArrayList<ItemGrid> objects) {
        super(context, textViewResourceId, objects);
        arrayList = objects;

    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_grid, null);
        TextView textView = (TextView) v.findViewById(R.id.TxtName);
        ImageView imageView = (ImageView) v.findViewById(R.id.ImgGambar);
        textView.setText(arrayList.get(position).getNamaText());
        imageView.setImageResource(arrayList.get(position).getGambarIcon());
        return v;

    }
}
