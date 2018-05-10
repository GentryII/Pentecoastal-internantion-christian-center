package com.example.android.uamp.ui.tv;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

import com.example.android.uamp.R;

import org.videolan.libvlc.IVLCVout;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class LiveActivity extends AppCompatActivity {
    public final static String TAG = "LiveActivity";
    private String mFilePath;
    private SurfaceView mSurface;
    private SurfaceHolder holder;
    private LibVLC libvlc;
    private MediaPlayer mMediaPlayer = null;
    private int mVideoWidth;
    private int mVideoHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://vlabshostels.epizy.com/picc.html"));


        startActivity(intent);
    }
}