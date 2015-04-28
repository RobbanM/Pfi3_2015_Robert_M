package com.robert.assignment_4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class PlanetDialog extends Fragment implements View.OnClickListener{

    public PlanetDialog(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_planet, container, false);
        Planet p = (Planet) getArguments().getSerializable("Planet");

        TextView tv_title = (TextView) v.findViewById(R.id.tv_dialog_title);
        tv_title.setText(p.getName());

        TextView tv_description = (TextView) v.findViewById(R.id.tv_dialog_description);
        tv_description.setText(p.getText());

        ImageView iv = (ImageView) v.findViewById(R.id.iv_dialog);

        v.setOnClickListener(this);
        tv_description.setOnClickListener(this);
        iv.setOnClickListener(this);
        tv_title.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {

    }
}

