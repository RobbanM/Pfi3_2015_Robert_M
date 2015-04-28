package com.robert.assignment_4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends ArrayAdapter<Planet> {
    ArrayList<Planet> planetList;
    Context c;

    public MyAdapter(Context context, ArrayList<Planet> planetList) {
        super(context, 0, planetList);
        this.planetList = planetList;
        this.c = context;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.listitem,null);
        Planet b = planetList.get(position);
        TextView tv = (TextView) convertView.findViewById(R.id.listName);
        ImageView iv = (ImageView) convertView.findViewById(R.id.listImage);
        tv.setText(b.getName());
        iv.setImageDrawable(b.getImage());

        return convertView;
    }
}