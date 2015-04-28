package com.robert.assignment_4;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class GridFragment extends Fragment {
    public static ArrayList<Planet> planets = new ArrayList<Planet>();
    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        planets.clear();

        Drawable d = getResources().getDrawable(R.drawable.mercury);
        planets.add(new Planet(getString(R.string.mercury), d, getString(R.string.mercury_radius), getString(R.string.mercury_temp), getString(R.string.mercury_info)));

        d = getResources().getDrawable(R.drawable.venus);
        planets.add(new Planet(getString(R.string.venus), d, getString(R.string.venus_radius), getString(R.string.venus_temp), getString(R.string.venus_info)));

        d = getResources().getDrawable(R.drawable.earth);
        planets.add(new Planet(getString(R.string.earth), d, getString(R.string.earth_radius), getString(R.string.earth_temp), getString(R.string.earth_info)));

        d = getResources().getDrawable(R.drawable.mars);
        planets.add(new Planet(getString(R.string.mars), d, getString(R.string.mars_radius), getString(R.string.mars_temp), getString(R.string.mars_info)));

        d = getResources().getDrawable(R.drawable.jupiter);
        planets.add(new Planet(getString(R.string.jupiter), d, getString(R.string.jupiter_radius), getString(R.string.jupiter_temp), getString(R.string.jupiter_info)));

        d = getResources().getDrawable(R.drawable.saturn);
        planets.add(new Planet(getString(R.string.saturn), d, getString(R.string.saturn_radius), getString(R.string.saturn_temp), getString(R.string.saturn_info)));

        d = getResources().getDrawable(R.drawable.uranus);
        planets.add(new Planet(getString(R.string.uranus), d, getString(R.string.uranus_radius), getString(R.string.uranus_temp), getString(R.string.uranus_info)));

        d = getResources().getDrawable(R.drawable.neptune);
        planets.add(new Planet(getString(R.string.neptune), d, getString(R.string.neptune_radius), getString(R.string.neptune_temp), getString(R.string.neptune_info)));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragmentgrid, container, false);
        //Log.i("FragmentWithList", "NumberOfPlanets: " + planets.size());
        MyAdapter pa = new MyAdapter(getActivity(),planets);

        GridView lv = (GridView) v.findViewById(R.id.gridView);
        lv.setAdapter(pa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //Log.i("FragmentWithList", "Clicked on position: " + position);
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Planet p = planets.get(position);
                PlanetFragment pf = new PlanetFragment();
                Bundle b = new Bundle();
                b.putSerializable("planet", p);
                pf.setArguments(b);
                ft.replace(R.id.MainActivity, pf);
                ft.addToBackStack(null);

                ft.commit();
            }
        });

        return v;
    }


}