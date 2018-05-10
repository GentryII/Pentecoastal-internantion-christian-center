package com.example.android.uamp.ui;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.uamp.R;
import com.example.android.uamp.ui.tv.LiveActivity;
import com.example.android.uamp.ui.tv.SharedPrefManager;

import java.net.URI;

public class ProfileActivity extends AppCompatActivity{
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;
    private Button livePlay;
    private Button download;
    private DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //mToolbar = (Toolbar) findViewById(R.id.includeProfile);
        livePlay = (Button) findViewById(R.id.button);
        livePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LiveActivity.class));
                //finish();
            }
        });

        Button videoList = (Button) findViewById(R.id.buttonRecorded);
        videoList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), VideoListActivity.class));
                //finish();
            }
        });

        download = (Button) findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("http://virtuallabsonline.000webhostapp.com/QuickSermon-local/public/img/picc.jpg");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManager.enqueue(request);
            }
        });
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("PICC Online");

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerProfileLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    /*case R.id.sunday_sermons:
                        Intent i = new Intent(ProfileActivity.this, MusicPlayerActivity.class);
                        startActivity(i);
                        break;*/
                    //case R.id.logout:
                        //SharedPrefManager.getInstance(this).logout();
                        //Intent e = new Intent(ProfileActivity.this, LoginActivity.class);
                        //startActivity(e);
                        //break;

                    case R.id.live_sermons:
                        Intent f = new Intent(ProfileActivity.this, LiveActivity.class);
                        startActivity(f);
                        break;
                    case R.id.videos:
                        Intent s = new Intent(ProfileActivity.this, VideoListActivity.class);
                        startActivity(s);
                        break;

                    case R.id.contact:
                        Intent g = new Intent(ProfileActivity.this, ContactUsActivity.class);
                        startActivity(g);
                        break;
                    /*case R.id.register:
                        Intent e= new Intent(ProfileActivity.this, RegistrationActivity.class);
                        startActivity(e);
                        break;*/
                    case R.id.schedule:
                        Intent h= new Intent(ProfileActivity.this, ScheduleActicity.class);
                        startActivity(h);
                        break;
                    /*case R.id.social:
                        Intent j= new Intent(ProfileActivity.this, SocialMediaActivity.class);
                        startActivity(j);
                        break;*/
                    case R.id.bible:
                        Intent a= new Intent(ProfileActivity.this, BibleActivity.class);
                        startActivity(a);
                        break;
                    case R.id.help:
                        Intent z= new Intent(ProfileActivity.this, HelpActivity.class);
                        startActivity(z);
                        break;
                    case R.id.devotion:
                        Intent b= new Intent(ProfileActivity.this, DevotionActivity.class);
                        startActivity(b);
                        break;
                }
                return false;
            }
        });
    }
    /*@Override
    public boolean onOptionsItemSelected(MenuItem item)    {
        switch (item.getItemId())
        {
            case R.id.sunday_sermons:
                Intent account =new Intent(ProfileActivity.this,MusicPlayerActivity.class);
                startActivity(account);

                break;
        }
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return true;
    }*/
}
