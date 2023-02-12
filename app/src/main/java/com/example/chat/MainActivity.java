package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Month [] months = {
            new Month("January", -5.5, R.drawable.snow),
            new Month("February", -2.5, R.drawable.snow),
            new Month("March", 5.5, R.drawable.rain),
            new Month("April", 15.5, R.drawable.rain),
            new Month("May", 23.4, R.drawable.sun),
            new Month("June", 27.5, R.drawable.sun),
            new Month("July", 30.5, R.drawable.sun),
            new Month("August", 32.5, R.drawable.sun),
            new Month("September", 24.5, R.drawable.sun),
            new Month("October", 15.5, R.drawable.rain),
            new Month("November", 6.5, R.drawable.rain),
            new Month("December", 0.5, R.drawable.snow)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MonthAdapter monthAdapter = new MonthAdapter(this,months);
        ListView lv = findViewById(R.id.month_list);
        lv.setAdapter(monthAdapter);
    }


}