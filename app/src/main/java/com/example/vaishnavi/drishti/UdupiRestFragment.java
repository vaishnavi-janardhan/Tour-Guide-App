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
public class UdupiRestFragment extends Fragment {


    public UdupiRestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);
        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.udupi_hotel_1), getString(R.string.udupi_hotel_desc1), R.drawable.udupi_hotel1));
        locations.add(new Location(getString(R.string.udupi_hotel_2), getString(R.string.udupi_hotel_desc2), R.drawable.udupi_hotel2));
        locations.add(new Location(getString(R.string.udupi_hotel_3), getString(R.string.udupi_hotel_desc3), R.drawable.udupi_hotel3));
        locations.add(new Location(getString(R.string.udupi_hotel_4), getString(R.string.udupi_hotel_desc4), R.drawable.udupi_hotel4));
        locations.add(new Location(getString(R.string.udupi_hotel_5), getString(R.string.udupi_hotel_desc5), R.drawable.udupi_hotel5));
        locations.add(new Location(getString(R.string.udupi_hotel_6), getString(R.string.udupi_hotel_desc6), R.drawable.udupi_hotel6));
        locations.add(new Location(getString(R.string.udupi_hotel_7), getString(R.string.udupi_hotel_desc7), R.drawable.udupi_hotel7));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
