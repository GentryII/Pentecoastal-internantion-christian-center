package com.example.android.uamp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.uamp.R;

public class GenesisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genesis);

        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("Genesis");
    }
}
