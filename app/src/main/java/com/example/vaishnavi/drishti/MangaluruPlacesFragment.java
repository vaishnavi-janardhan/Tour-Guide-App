package com.example.vaishnavi.drishti;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MangaluruPlacesFragment extends Fragment {


    public MangaluruPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.mang_place1), getString(R.string.mang_des1), R.drawable.mang_image1));
        locations.add(new Location(getString(R.string.mang_place2), getString(R.string.mang_des2), R.drawable.mang_image2));
        locations.add(new Location(getString(R.string.mang_place3), getString(R.string.mang_des3), R.drawable.mang_image3));
        locations.add(new Location(getString(R.string.mang_place4), getString(R.string.mang_des4), R.drawable.mang_image4));
        locations.add(new Location(getString(R.string.mang_place5), getString(R.string.mang_des5), R.drawable.mang_image5));
        locations.add(new Location(getString(R.string.mang_place6), getString(R.string.mang_des6), R.drawable.mang_image6));
        locations.add(new Location(getString(R.string.mang_place7), getString(R.string.mang_des7), R.drawable.mang_image7));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
