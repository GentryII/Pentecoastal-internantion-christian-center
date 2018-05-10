package com.example.android.uamp.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.uamp.R;
//import com.example.android.uamp.ui.VideoStreamingActivty;
import com.example.android.uamp.ui.VideoStreamingActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by user1 on 07/02/2018.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder>
{
    private List<ListItem> listItems;
    private Context context;

    public VideoAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.video_items, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ListItem listItem = listItems.get(position);

        holder.vTitle.setText(listItem.getTitle());
        holder.vDate.setText(listItem.getDate());
        holder.url.setText(listItem.getLinkURL());

        Picasso.with(context)
        .load(listItem.getImageURL())
        .into(holder.imageView);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context, "You clicked " + listItem.getTitle(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, VideoStreamingActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("link", listItem.getLinkURL());
                context.startActivity(intent);
                //v.getContext;
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder

    {
        public TextView vTitle;
        public TextView vDate;
        public TextView url;
        public ImageView imageView;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            vTitle = (TextView) itemView.findViewById(R.id.title);
            vDate = (TextView) itemView.findViewById(R.id.date);
            url = (TextView) itemView.findViewById(R.id.url);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
