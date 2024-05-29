package com.questionbank.aktuquantumapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.concurrent.atomic.AtomicInteger;

public class SelectYearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_year);

        getSupportActionBar().hide();

        AtomicInteger selectedButt = new AtomicInteger();

        CardView butt1year = findViewById(R.id.year_1_select);
        CardView butt2year = findViewById(R.id.year_2_select);
        CardView butt3year = findViewById(R.id.year_3_select);
        CardView butt4year = findViewById(R.id.year_4_select);

        butt1year.setOnClickListener(view -> {
            findViewById(R.id.nxt_butt).setEnabled(true);
            selectedButt.set(1);
            butt1year.setCardBackgroundColor(getResources().getColor(R.color.purple_200));
            butt2year.setCardBackgroundColor(null);
            butt3year.setCardBackgroundColor(null);
            butt4year.setCardBackgroundColor(null);
        });
        butt2year.setOnClickListener(view -> {
            findViewById(R.id.nxt_butt).setEnabled(true);
            selectedButt.set(2);
            butt2year.setCardBackgroundColor(getResources().getColor(R.color.purple_200));
            butt1year.setCardBackgroundColor(null);
            butt3year.setCardBackgroundColor(null);
            butt4year.setCardBackgroundColor(null);
        });
        butt3year.setOnClickListener(view -> {
            findViewById(R.id.nxt_butt).setEnabled(true);
            selectedButt.set(3);
            butt3year.setCardBackgroundColor(getResources().getColor(R.color.purple_200));
            butt2year.setCardBackgroundColor(null);
            butt1year.setCardBackgroundColor(null);
            butt4year.setCardBackgroundColor(null);
        });
        butt4year.setOnClickListener(view -> {
            findViewById(R.id.nxt_butt).setEnabled(true);
            selectedButt.set(4);
            butt4year.setCardBackgroundColor(getResources().getColor(R.color.purple_200));
            butt2year.setCardBackgroundColor(null);
            butt3year.setCardBackgroundColor(null);
            butt1year.setCardBackgroundColor(null);
        });

        findViewById(R.id.nxt_butt).setOnClickListener(view -> {
            //TODO:Next Button
            Intent intent = new Intent(this, SelectQuantumActivity.class);
            intent.putExtra("year", selectedButt.intValue());
            startActivity(intent);
        });
    }
}