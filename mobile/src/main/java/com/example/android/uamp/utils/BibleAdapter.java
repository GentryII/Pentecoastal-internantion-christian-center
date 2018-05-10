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
import com.example.android.uamp.ui.ActsActivity;
import com.example.android.uamp.ui.AmosActivity;
import com.example.android.uamp.ui.Chronicles1Activity;
import com.example.android.uamp.ui.Chronicles2Activity;
import com.example.android.uamp.ui.ColossiansActivity;
import com.example.android.uamp.ui.Corinthians1Activity;
import com.example.android.uamp.ui.Corinthians2Activity;
import com.example.android.uamp.ui.DanielActivity;
import com.example.android.uamp.ui.DeuteronomyActivity;
import com.example.android.uamp.ui.EcclesiastesActivity;
import com.example.android.uamp.ui.EphasiansActivity;
import com.example.android.uamp.ui.EstherActivity;
import com.example.android.uamp.ui.ExodusActivity;
import com.example.android.uamp.ui.EzekielActivity;
import com.example.android.uamp.ui.EzraActivity;
import com.example.android.uamp.ui.GalatiansActivity;
import com.example.android.uamp.ui.GenesisActivity;
import com.example.android.uamp.ui.HabakkukActivity;
import com.example.android.uamp.ui.HaggaiActivity;
import com.example.android.uamp.ui.HebrewsActivity;
import com.example.android.uamp.ui.HoseaActivity;
import com.example.android.uamp.ui.JamesActivity;
import com.example.android.uamp.ui.JeremiahActivity;
import com.example.android.uamp.ui.JobActivity;
import com.example.android.uamp.ui.JoelActivity;
import com.example.android.uamp.ui.John1Activity;
import com.example.android.uamp.ui.John2Activity;
import com.example.android.uamp.ui.John3Activity;
import com.example.android.uamp.ui.JohnActivity;
import com.example.android.uamp.ui.JonahActivity;
import com.example.android.uamp.ui.JoshuaActivity;
import com.example.android.uamp.ui.JudeActivity;
import com.example.android.uamp.ui.JudgesActivity;
import com.example.android.uamp.ui.Kings1Activity;
import com.example.android.uamp.ui.LamentationsActivity;
import com.example.android.uamp.ui.LukeActivity;
import com.example.android.uamp.ui.MalachiActivity;
import com.example.android.uamp.ui.MarkActivity;
import com.example.android.uamp.ui.MatthewActivity;
import com.example.android.uamp.ui.MicahActivity;
import com.example.android.uamp.ui.NahumActivity;
import com.example.android.uamp.ui.NehemiahActivity;
import com.example.android.uamp.ui.NumbersActivity;
import com.example.android.uamp.ui.ObadiahActivity;
import com.example.android.uamp.ui.Peter1Activity;
import com.example.android.uamp.ui.Peter2Activity;
import com.example.android.uamp.ui.PhilemonActivity;
import com.example.android.uamp.ui.PhilippiansActivity;
import com.example.android.uamp.ui.PsalmsActivity;
import com.example.android.uamp.ui.RevelationsActivity;
import com.example.android.uamp.ui.RomansActivity;
import com.example.android.uamp.ui.RuthActivity;
import com.example.android.uamp.ui.Saamuel1Activity;
import com.example.android.uamp.ui.Samuel2Activity;
import com.example.android.uamp.ui.SongofSongsActivity;
import com.example.android.uamp.ui.Thessalonians1Activity;
import com.example.android.uamp.ui.Thessalonians2Activity;
import com.example.android.uamp.ui.Timothy1Activity;
import com.example.android.uamp.ui.Timothy2Activity;
import com.example.android.uamp.ui.TitusActivity;
import com.example.android.uamp.ui.ZechariahActivity;
import com.example.android.uamp.ui.ZephaniahActivity;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Objects;

/**
 * Created by user1 on 19/02/2018.
 */

public class BibleAdapter extends RecyclerView.Adapter<BibleAdapter.ViewHolder>
{
    private List<BibleBooksListItem> listItems;
    private Context context;

    public BibleAdapter(List<BibleBooksListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public BibleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bible_books_list, parent, false);
        return new BibleAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BibleAdapter.ViewHolder holder, int position) {
        final BibleBooksListItem listItem = listItems.get(position);

        holder.book.setText(listItem.getBook());


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String book;
                book = listItem.getBook();

                //Toast.makeText(context, "You clicked " + listItem.getTitle(), Toast.LENGTH_SHORT).show();
                if(book.equals("Genesis"))
                {
                    Intent intent = new Intent(context, GenesisActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Exodus"))
                {
                    Intent intent = new Intent(context, ExodusActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Leviticus"))
                {
                    Intent intent = new Intent(context, ExodusActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Numbers"))
                {
                    Intent intent = new Intent(context, NumbersActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Deuteronomy"))
                {
                    Intent intent = new Intent(context, DeuteronomyActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Joshua"))
                {
                    Intent intent = new Intent(context, JoshuaActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Judges"))
                {
                    Intent intent = new Intent(context, JudgesActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Ruth"))
                {
                    Intent intent = new Intent(context, RuthActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("1 Samuel"))
                {
                    Intent intent = new Intent(context, Saamuel1Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("2 Samuel"))
                {
                    Intent intent = new Intent(context, Samuel2Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("1 Kings"))
                {
                    Intent intent = new Intent(context, Kings1Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("1 Chronicles"))
                {
                    Intent intent = new Intent(context, Chronicles1Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("2 Chronicles"))
                {
                    Intent intent = new Intent(context, Chronicles2Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Ezra"))
                {
                    Intent intent = new Intent(context, EzraActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Nehemiah"))
                {
                    Intent intent = new Intent(context, NehemiahActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Esther"))
                {
                    Intent intent = new Intent(context, EstherActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Job"))
                {
                    Intent intent = new Intent(context, JobActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Psalms"))
                {
                    Intent intent = new Intent(context, PsalmsActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Proverbs"))
                {
                    Intent intent = new Intent(context, PsalmsActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Ecclesiastes"))
                {
                    Intent intent = new Intent(context, EcclesiastesActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Song of Songs"))
                {
                    Intent intent = new Intent(context, SongofSongsActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Isaiah"))
                {
                    Intent intent = new Intent(context, ExodusActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Jeremiah"))
                {
                    Intent intent = new Intent(context, JeremiahActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Lamentations"))
                {
                    Intent intent = new Intent(context, LamentationsActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Ezekiel"))
                {
                    Intent intent = new Intent(context, EzekielActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Daniel"))
                {
                    Intent intent = new Intent(context, DanielActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Hosea"))
                {
                    Intent intent = new Intent(context, HoseaActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Joel"))
                {
                    Intent intent = new Intent(context, JoelActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Amos"))
                {
                    Intent intent = new Intent(context, AmosActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Obadiah"))
                {
                    Intent intent = new Intent(context, ObadiahActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Jonah"))
                {
                    Intent intent = new Intent(context, JonahActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Micah"))
                {
                    Intent intent = new Intent(context, MicahActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Nahum"))
                {
                    Intent intent = new Intent(context, NahumActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Habakkuk"))
                {
                    Intent intent = new Intent(context, HabakkukActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Zephaniah"))
                {
                    Intent intent = new Intent(context, ZephaniahActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Haggai"))
                {
                    Intent intent = new Intent(context, HaggaiActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Zechariah"))
                {
                    Intent intent = new Intent(context, ZechariahActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Malachi"))
                {
                    Intent intent = new Intent(context, MalachiActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Matthew"))
                {
                    Intent intent = new Intent(context, MatthewActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Mark"))
                {
                    Intent intent = new Intent(context, MarkActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Luke"))
                {
                    Intent intent = new Intent(context, LukeActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("John"))
                {
                    Intent intent = new Intent(context, JohnActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Acts"))
                {
                    Intent intent = new Intent(context, ActsActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Romans"))
                {
                    Intent intent = new Intent(context, RomansActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("1 Corinthians"))
                {
                    Intent intent = new Intent(context, Corinthians1Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("2 Corinthians"))
                {
                    Intent intent = new Intent(context, Corinthians2Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Galatians"))
                {
                    Intent intent = new Intent(context, GalatiansActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Ephesians"))
                {
                    Intent intent = new Intent(context, EphasiansActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Philippians"))
                {
                    Intent intent = new Intent(context, PhilippiansActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Colossians"))
                {
                    Intent intent = new Intent(context, ColossiansActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("1 Thessalonians"))
                {
                    Intent intent = new Intent(context, Thessalonians1Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("2 Thessalonians"))
                {
                    Intent intent = new Intent(context, Thessalonians2Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("1 Timothy"))
                {
                    Intent intent = new Intent(context, Timothy1Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("2 Timothy"))
                {
                    Intent intent = new Intent(context, Timothy2Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Titus"))
                {
                    Intent intent = new Intent(context, TitusActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Philemon"))
                {
                    Intent intent = new Intent(context, PhilemonActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Hebrews"))
                {
                    Intent intent = new Intent(context, HebrewsActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("James"))
                {
                    Intent intent = new Intent(context, JamesActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("1 Peter"))
                {
                    Intent intent = new Intent(context, Peter1Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("2 Peter"))
                {
                    Intent intent = new Intent(context, Peter2Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("1 John"))
                {
                    Intent intent = new Intent(context, John1Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("2 John"))
                {
                    Intent intent = new Intent(context, John2Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("3 John"))
                {
                    Intent intent = new Intent(context, John3Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Jude"))
                {
                    Intent intent = new Intent(context, JudeActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else if(book.equals("Revelations"))
                {
                    Intent intent = new Intent(context, RevelationsActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    //intent.putExtra("link", listItem.getLinkURL());
                    context.startActivity(intent);
                    //v.getContext;
                }
                else
                {

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder

    {
        public TextView book;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            book = (TextView) itemView.findViewById(R.id.book);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
}
