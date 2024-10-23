package com.example.dumvanimechat.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.dumvanimechat.R;

import java.util.ArrayList;

public class AnimeChonAdapter extends ArrayAdapter<AnimeChon> {
Context ct;
    public AnimeChonAdapter(@NonNull Context context, ArrayList<AnimeChon> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
        ct=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_nhan_vat, parent, false);
        }

        AnimeChon anime = getItem(position);
        ImageView imganh = listitemView.findViewById(R.id.imganh);
        TextView name_cha = listitemView.findViewById(R.id.name_cha);
        TextView cap_cha = listitemView.findViewById(R.id.cap_cha);

        Glide.with(ct)
                .load(anime.getAvata()).into(imganh);

        name_cha.setText(anime.getName());
        cap_cha.setText(anime.getCap());
        return listitemView;
    }
}