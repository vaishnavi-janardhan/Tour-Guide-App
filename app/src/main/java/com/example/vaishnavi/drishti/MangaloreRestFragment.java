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
public class MangaloreRestFragment extends Fragment {


    public MangaloreRestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location("Janatha Deluxe", "All vegetarian with over 2 decades of service", R.drawable.mang_rest1));
        locations.add(new Location("Pallkhi Restaurant", "One of the most trusted and popular restaurant", R.drawable.mang_rest2));
        locations.add(new Location("Hotel Maharaja", "Veg and Non-veg ghee roasts", R.drawable.mang_rest3));
        locations.add(new Location("Gajalee", "Located on a hilltop with breathtaking views", R.drawable.mang_rest4));
        locations.add(new Location("Hotel Machali", "Special thalis for fish lovers", R.drawable.mang_rest5));
        locations.add(new Location("Pabbas", "Ice cream, fast food", R.drawable.mang_rest6));
        locations.add(new Location("Giri Manja's", "Casual dining and seafood", R.drawable.mang_rest7));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
