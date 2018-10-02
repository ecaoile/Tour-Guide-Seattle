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
 * {@link OutdoorFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OutdoorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OutdoorFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Kerry Park", "Kerry Park is a 1.26-acre" +
                " park on the south slope of Queen Anne Hill, located at" +
                " the corner of Second Avenue West and West Highland Drive.", R.drawable.kerry_park));
        attractions.add(new Attraction("Gas Works Park", "Gas Works Park," +
                " in Seattle, Washington, is a 19.1-acre public park on the site of the former" +
                " Seattle Gas Light Company gasification plant.",
                R.drawable.gas_works_park));
        attractions.add(new Attraction("Woodland Park Zoo", "Woodland Park Zoo is" +
                " a zoological garden located in the Phinney Ridge neighborhood of Seattle," +
                " Washington.", R.drawable.woodland_park_zoo));
        attractions.add(new Attraction("Olympic Sculpture Park", "The Olympic" +
                " Sculpture Park, created and operated by the Seattle Art Museum, is a park," +
                " free and open to the public that opened on " +
                "January 20, 2007.", R.drawable.olympic_sculpture_park));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_outdoor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
