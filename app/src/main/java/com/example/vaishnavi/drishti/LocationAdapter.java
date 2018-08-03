package com.example.vaishnavi.drishti;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Location} objects.
 * */
public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param locations A List of location objects to display in a list
     */
    public LocationAdapter(@NonNull Context context, @NonNull ArrayList<Location> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        //Find the TextView with the name location_name
        TextView locationName = convertView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getLocationName());

        //Find the TextView with the name location details
        TextView locationDetails = convertView.findViewById(R.id.location_details);
        locationDetails.setText(currentLocation.getLocationDetails());

        //Find the ImageView with the id location_image
        ImageView locationImage = convertView.findViewById(R.id.location_image);
        locationImage.setImageResource(currentLocation.getLocationImageResourceId());

        //Return the whole list item layout containing 2 text views and 1 image view
        return convertView;

    }
}

