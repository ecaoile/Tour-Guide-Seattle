package com.example.android.tourguideseattle;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Attr;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private int mColorResourceId;

    public AttractionAdapter(Activity context, ArrayList<Attraction> words, int colorResourceId)
    {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        TextView nameTextView = (TextView) convertView.findViewById(R.id.attraction_text_view);
        nameTextView.setText(currentAttraction.getName());

        TextView descriptionTextView = (TextView) convertView.findViewById(R.id.default_text_view);
        descriptionTextView.setText(currentAttraction.getDescription());

        ImageView imageView = (ImageView)convertView.findViewById(R.id.image);


        if (currentAttraction.hasImage()) {
            imageView.setImageResource(currentAttraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = convertView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return convertView;
    }
}
