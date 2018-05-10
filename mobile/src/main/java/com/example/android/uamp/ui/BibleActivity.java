package com.example.android.uamp.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.android.uamp.R;
import com.example.android.uamp.utils.BibleAdapter;
import com.example.android.uamp.utils.BibleBooksListItem;
import com.example.android.uamp.utils.ListItem;
import com.example.android.uamp.utils.VideoAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class BibleActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<BibleBooksListItem> listItems;
    private Button oldTestament;
    private Button newTestament;
    private String books = "{\"book\":[{\"title\":\"Genesis\"}, {\"title\":\"Exodus\"}, {\"title\":\"Leviticus\"}, {\"title\":\"Numbers\"}, {\"title\":\"Deuteronomy\"}, \n" +
            "{\"title\":\"Joshua\"}, {\"title\":\"Judges\"}, {\"title\":\"Ruth\"}, {\"title\":\"1 Samuel\"}, {\"title\":\"2 Samuel\"}, {\"title\":\"1 Kings\"},\n" +
            "{\"title\":\"2 Kings\"}, {\"title\":\"1 Chronicles\"}, {\"title\":\"2 Chronicles\"}, {\"title\":\"Ezra\"}, {\"title\":\"Nehemiah\"}, {\"title\":\"Esther\"},\n" +
            "{\"title\":\"Job\"}, {\"title\":\"Psalms\"}, {\"title\":\"Proverbs\"}, {\"title\":\"Ecclesiastes\"}, {\"title\":\"The Song of Solomon\"},\n" +
            "{\"title\":\"Isaiah\"}, {\"title\":\"Jeremiah\"}, {\"title\":\"Lamentations\"}, {\"title\":\"Ezekiel\"}, {\"title\":\"Daniel\"}, {\"title\":\"Hosea\"},\n" +
            "{\"title\":\"Joel\"}, {\"title\":\"Amos\"}, {\"title\":\"Obadiah\"}, {\"title\":\"Jonah\"}, {\"title\":\"Micah\"}, {\"title\":\"Nahum\"}, {\"title\":\"Habakkuk\"},\n" +
            "{\"title\":\"Zephaniah\"}, {\"title\":\"Haggai\"}, {\"title\":\"Zechariah\"}, {\"title\":\"Malachi\"}]}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        oldTestament = findViewById(R.id.old);
        newTestament = findViewById(R.id.newT);
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("Old Testament");

        newTestament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), NewTestamentActivity.class));
            }
        });
        oldTestament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BibleActivity.class));
            }
        });


        listItems = new ArrayList<>();
        loadRecyclerViewData();
    }

    private void loadRecyclerViewData()
    {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        //progressDialog.setMessage("Loading videos");
        //progressDialog.show();

        try {
            JSONObject jsonObject = new JSONObject(books);
            JSONArray array = jsonObject.getJSONArray("book");

            for(int i = 0; i < array.length(); i++)
            {
                JSONObject object = array.getJSONObject(i);
                BibleBooksListItem item = new BibleBooksListItem(
                        object.getString("title")
                );
                listItems.add(item);
            }
            adapter = new BibleAdapter(listItems, getApplicationContext());
            recyclerView.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
