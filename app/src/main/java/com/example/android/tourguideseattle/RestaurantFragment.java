package com.example.android.tourguideseattle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RestaurantFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RestaurantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.citizen_name),
                getString(R.string.citizen_info), R.drawable.citizen_food));
        attractions.add(new Attraction(getString(R.string.revel_name),
                getString(R.string.revel_info),
                R.drawable.revel_food));
        attractions.add(new Attraction(getString(R.string.umi_name),
                getString(R.string.umi_info), R.drawable.umi_food));
        attractions.add(new Attraction(getString(R.string.barolo_name),
                getString(R.string.barolo_info), R.drawable.barolo_food));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions,
                R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
