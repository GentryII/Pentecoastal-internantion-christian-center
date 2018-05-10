package com.example.android.uamp.ui;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.uamp.R;
import com.example.android.uamp.utils.BibleAdapter;
import com.example.android.uamp.utils.BibleBooksListItem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class NewTestamentActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<BibleBooksListItem> listItems;
    private Button oldTestament;
    private Button newTestament;
    private String books = "{\"book\":[{\"title\":\"Matthew\"}, {\"title\":\"Luke\"}, {\"title\":\"John\"}, {\"title\":\"Acts of the Apostles\"}, {\"title\":\"Romans\"}, {\"title\":\"1 Corinthians\"},\n" +
            "{\"title\":\"2 Corinthians\"}, {\"title\":\"Galatians\"}, {\"title\":\"Ephesians\"}, {\"title\":\"Philippians\"}, {\"title\":\"Colossians\"},\n" +
            "{\"title\":\"1 Thessalonians\"}, {\"title\":\"2 Thessalonians\"}, {\"title\":\"1 Timothy\"}, {\"title\":\"2 Timothy\"}, {\"title\":\"Titus\"},\n" +
            "{\"title\":\"Philemon\"}, {\"title\":\"Hebrews\"}, {\"title\":\"James\"}, {\"title\":\"1 Peter\"}, {\"title\":\"2 Peter\"}, {\"title\":\"1 John\"},\n" +
            "{\"title\":\"2 John\"}, {\"title\":\"3 John\"}, {\"title\":\"Jude\"}, {\"title\":\"Revelations\"}]}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_testament);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        TextView textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("New Testament");

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
