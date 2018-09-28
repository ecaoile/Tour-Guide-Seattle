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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link StructuresFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link StructuresFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StructuresFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Space Needle", "Iconic, 605-ft.-tall spire at the Seattle" +
                " Center, with an observation deck & a rotating restaurant."));
        attractions.add(new Attraction("Pike Place Market", "Pike Place Market is" +
                " a public market overlooking the Elliott Bay waterfront in Seattle, Washington," +
                " United States. " +
                "The Market opened August 17, 1907, and is one of the oldest continuously operated" +
                " public farmers' markets in the United States."));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_structures);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
