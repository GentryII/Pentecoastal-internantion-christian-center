package com.example.android.uamp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.android.uamp.R;

public class SocialMediaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("PICC on Social Media");

        TextView facebook = (TextView) findViewById(R.id.facebook);
        TextView youtube = (TextView) findViewById(R.id.youtube);
        TextView twitter = (TextView) findViewById(R.id.twitter);

        String linkText = "<a href='http://facebook.com/pastoresaubanda'>Follow PICC on Facebook</a>";
        facebook.setText(Html.fromHtml(linkText));
        facebook.setMovementMethod(LinkMovementMethod.getInstance());

        String linkTube = "<a href='http://youtube.com'>Stream PICC videos on Youtube</a>";
        youtube.setText(Html.fromHtml(linkTube));
        youtube.setMovementMethod(LinkMovementMethod.getInstance());

        String linkTwitter = "<a href='http://twitter.com/esaubanda'>Follow PICC on Twitter</a>";
        twitter.setText(Html.fromHtml(linkTwitter));
        twitter.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
