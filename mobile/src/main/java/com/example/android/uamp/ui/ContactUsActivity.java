package com.example.android.uamp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.android.uamp.R;

public class ContactUsActivity extends AppCompatActivity {

   Toolbar toolbar;
   TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        toolbar = (Toolbar) findViewById(R.id.include4);
        textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("Contact Us");

        TextView email = (TextView) findViewById(R.id.email);
        TextView website = (TextView) findViewById(R.id.website);

        //String emailText = "<a href=\"mailto:pastoresaubanda@gmail.com\">pastoresaubanda@gmail.com</a>";
        //email.setText(Html.fromHtml(emailText));
        email.setMovementMethod(LinkMovementMethod.getInstance());

        String linkText = "<a href='http://piccinternational.org'>www.piccinternational.org</a>";
        website.setText(Html.fromHtml(linkText));
        website.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
