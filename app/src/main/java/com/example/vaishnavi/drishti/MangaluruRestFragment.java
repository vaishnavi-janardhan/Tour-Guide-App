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
public class MangaluruRestFragment extends Fragment {


    public MangaluruRestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.mang_hotel1), getString(R.string.mang_hotel_des1), R.drawable.mang_rest1));
        locations.add(new Location(getString(R.string.mang_hotel2), getString(R.string.mang_hotel_des2), R.drawable.mang_rest2));
        locations.add(new Location(getString(R.string.mang_hotel3), getString(R.string.mang_hotel_des3), R.drawable.mang_rest3));
        locations.add(new Location(getString(R.string.mang_hotel4), getString(R.string.mang_hotel_des4), R.drawable.mang_rest4));
        locations.add(new Location(getString(R.string.mang_hotel5), getString(R.string.mang_hotel_des5), R.drawable.mang_rest5));
        locations.add(new Location(getString(R.string.mang_hotel6), getString(R.string.mang_hotel_des6), R.drawable.mang_rest6));
        locations.add(new Location(getString(R.string.mang_hotel7), getString(R.string.mang_hotel_des7), R.drawable.mang_rest7));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
