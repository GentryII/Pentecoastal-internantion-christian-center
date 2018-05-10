package com.example.android.uamp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.uamp.R;

public class John3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_john3);

        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("3 John");
    }
}
