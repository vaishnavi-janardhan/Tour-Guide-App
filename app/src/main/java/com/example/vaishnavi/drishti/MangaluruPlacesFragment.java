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

        locations.add(new Location("St. Aloysius Chapel", "1 km from city centre", R.drawable.mang_image1));
        locations.add(new Location("Kadri Park", "3 km from city centre", R.drawable.mang_image2));
        locations.add(new Location("New Mangalore Port", "4 km from city centre", R.drawable.mang_image3));
        locations.add(new Location("Panambur Beach", "10 km from city centre", R.drawable.mang_image4));
        locations.add(new Location("Kudroli Temple", "12 km from city centre", R.drawable.mang_image5));
        locations.add(new Location("Pilikula Nisargadhama", "15 km from city centre", R.drawable.mang_image6));
        locations.add(new Location("Tannirbavi Beach", "20 km from city centre", R.drawable.mang_image7));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
