package com.example.android.tourguideseattle;

public class Attraction {
    private String mName;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;
    public Attraction(String name, String description)
    {
        mName = name;
        mDescription = description;
    }

    public Attraction(String name, String description, int imageResourceId)
    {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName()
    {
        return mName;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
