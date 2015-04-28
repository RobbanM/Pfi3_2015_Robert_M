package com.robert.assignment_4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class PlanetFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_planet, container, false);
        Planet p = (Planet) getArguments().getSerializable("planet");

        TextView planetName = (TextView) v.findViewById(R.id.textViewPlanetName);
        planetName.setText(p.getName());

        ImageView planetImage = (ImageView) v.findViewById(R.id.imageViewPlanet);
        planetImage.setImageDrawable(p.getImage());

        TextView planetRadius = (TextView) v.findViewById(R.id.textViewPlanetInfo1);
       planetRadius.setText(p.getRadius());

        TextView planetTemp = (TextView) v.findViewById(R.id.textViewPlanetInfo2);
        planetTemp.setText(p.getTemp());

        TextView planetText = (TextView) v.findViewById(R.id.textViewPlanetText);
        planetText.setText(p.getText());

        return v;
    }
}