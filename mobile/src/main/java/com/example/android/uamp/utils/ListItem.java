package com.example.android.uamp.utils;

/**
 * Created by user1 on 07/02/2018.
 */

public class ListItem
{
    private String date;
    private String title;
    private String imageURL;
    private String linkURL;

    public ListItem(String date, String title, String imageURL, String linkURL) {
        this.date = date;
        this.title = title;
        this.imageURL =imageURL;
        this.linkURL =linkURL;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getLinkURL() {
        return linkURL;
    }
}
