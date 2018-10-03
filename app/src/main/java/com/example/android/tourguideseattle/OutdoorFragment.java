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


public class OutdoorFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.kerry_park_name),
                getString(R.string.kerry_park_info), R.drawable.kerry_park));
        attractions.add(new Attraction(getString(R.string.gas_works_park_name),
                getString(R.string.gas_works_park_info),
                R.drawable.gas_works_park));
        attractions.add(new Attraction(getString(R.string.woodland_name),
                getString(R.string.woodland_info), R.drawable.woodland_park_zoo));
        attractions.add(new Attraction(getString(R.string.olympic_park_name),
                getString(R.string.olympic_park_info), R.drawable.olympic_sculpture_park));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions,
                R.color.category_outdoor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
