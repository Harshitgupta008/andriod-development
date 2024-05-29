package com.questionbank.aktuquantumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.prev_year_ques_butt).setOnClickListener(view -> {
            //TODO:PREV YEAR QUESTION
            startActivity(new Intent(this, SelectYearActivity.class));
        });
    }
}