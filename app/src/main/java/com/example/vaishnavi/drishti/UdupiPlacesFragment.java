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
public class UdupiPlacesFragment extends Fragment {


    public UdupiPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("Sri Krishna Matha", "1 km from city centre", R.drawable.udupi_image1));
        locations.add(new Location("MAP, Manipal", "5.9 km from city centre", R.drawable.udupi_image6));
        locations.add(new Location("Endpoint, Manipal", "6.9 km from city centre", R.drawable.udupi_image3));
        locations.add(new Location("St. Mary's Island", "11.2 km from city centre", R.drawable.udupi_image2));
        locations.add(new Location("Kaup Beach", "16.4 km from city centre", R.drawable.udupi_image4));
        locations.add(new Location("Kudlu Theertha Falls", "42 km from city centre", R.drawable.udupi_image5));
        locations.add(new Location("Kamalashile", "62.4 km from city centre", R.drawable.udupi_image7));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
