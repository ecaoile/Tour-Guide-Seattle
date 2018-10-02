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
        attractions.add(new Attraction("Space Needle", "Iconic, 605-ft.-tall spire at the Seattle" +
                " Center, with an observation deck & a rotating restaurant.", R.drawable.space_needle));
        attractions.add(new Attraction("Pike Place Market", "Pike Place Market is" +
                " a public market overlooking the Elliott Bay waterfront in Seattle, Washington," +
                " United States.", R.drawable.pike_place_market));
        attractions.add(new Attraction("Chihuly Garden and Glass", "Chihuly Garden " +
                "and Glass is an exhibit in the Seattle Center showcasing the studio glass of Dale" +
                " Chihuly.", R.drawable.chihuly_garden));
        attractions.add(new Attraction("Museum of Pop Culture", "The Museum of" +
                " Pop Culture, or MoPOP is a nonprofit museum dedicated to contemporary popular" +
                " culture.", R.drawable.museum_of_pop));
        attractions.add(new Attraction("Seattle Center", "Seattle Center is an" +
                " arts, educational, tourism and entertainment center in Seattle, Washington," +
                " United States.", R.drawable.seattle_center));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_structures);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
