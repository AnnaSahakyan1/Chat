package com.example.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MonthAdapter extends ArrayAdapter<Month> {

    public MonthAdapter(Context context, Month[] arr) {
        super(context, R.layout.view_moth_item, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Month month = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.view_moth_item, null);
        }

        ((TextView) convertView.findViewById(R.id.name)).setText(month.name);
        ((ImageView) convertView.findViewById(R.id.icon)).setImageResource(R.drawable.sun);
        ((TextView) convertView.findViewById(R.id.temperature)).setText(String.valueOf(month.temperature));

        return convertView;
    }
}
