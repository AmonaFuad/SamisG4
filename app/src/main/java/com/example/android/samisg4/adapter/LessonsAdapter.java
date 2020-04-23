package com.example.android.samisg4.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.android.samisg4.R;
import com.example.android.samisg4.activities.EnglishActivity;
import com.example.android.samisg4.models.BaseClass;
import com.example.android.samisg4.models.Item;

import java.util.ArrayList;
import java.util.List;

public class LessonsAdapter extends ArrayAdapter<Item> {
    public LessonsAdapter(Activity context, ArrayList <Item> objects) {
        super(context,0, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            LayoutInflater inflater=LayoutInflater.from(getContext());
            listItemView =inflater.inflate(R.layout.custum_list_view, parent, false);
        }
        Item getwords = getItem(position);


        TextView titleTextView = (TextView) listItemView.findViewById(R.id.video_title);
        titleTextView.setText(getwords.getSnippet().getTitle());

    return listItemView;
    }
}
