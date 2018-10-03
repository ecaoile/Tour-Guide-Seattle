package com.example.android.tourguideseattle;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class StructuresFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.space_needle_name),
                getString(R.string.space_needle_info), R.drawable.space_needle));
        attractions.add(new Attraction(getString(R.string.pike_place_market_name),
                getString(R.string.pike_place_market_info), R.drawable.pike_place_market));
        attractions.add(new Attraction(getString(R.string.chihuly_name),
                getString(R.string.chihuly_info), R.drawable.chihuly_garden));
        attractions.add(new Attraction(getString(R.string.mopop_name),
                getString(R.string.mopop_info), R.drawable.museum_of_pop));
        attractions.add(new Attraction(getString(R.string.seattle_center_name),
                getString(R.string.seattle_center_info), R.drawable.seattle_center));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions,
                R.color.category_structures);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
