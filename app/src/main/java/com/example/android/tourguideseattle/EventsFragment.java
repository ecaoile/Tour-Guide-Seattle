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
 * {@link EventsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link EventsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.chinese_new_year_name),
                getString(R.string.chinese_new_year_info)));
        attractions.add(new Attraction(getString(R.string.cheese_festival_name),
                getString(R.string.cheese_festival_info)));
        attractions.add(new Attraction(getString(R.string.microbrew_festival_name),
                getString(R.string.microbrew_festival_info)));
        attractions.add(new Attraction(getString(R.string.salmon_festival_name),
                getString(R.string.salmon_festival_info)));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions,
                R.color.category_events);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
