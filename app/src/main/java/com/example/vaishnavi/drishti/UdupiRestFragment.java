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

        locations.add(new Location("Woodlands", "North and South Indian cuisine", R.drawable.udupi_hotel1));
        locations.add(new Location("Shanti Sagar", "Casual Dining - North Indian, South Indian, Chinese and Fast food", R.drawable.udupi_hotel2));
        locations.add(new Location("Diana Restaurant", "Signature dishes- Cutlet and Gadbad", R.drawable.udupi_hotel3));
        locations.add(new Location("Sagar Ratna", "A must try place for South Indian delicacies", R.drawable.udupi_hotel4));
        locations.add(new Location("Mayuri Ristorante", "Sunday special Buffet along with other options, good for large groups", R.drawable.udupi_hotel5));
        locations.add(new Location("Naturals", "Ice cream parlour: Amazing natutal flavours with seasonal surprises", R.drawable.udupi_hotel6));
        locations.add(new Location("Big Mishra Pedha", "Variety of sweets and street food", R.drawable.udupi_hotel7));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        return rootView;
    }

}
