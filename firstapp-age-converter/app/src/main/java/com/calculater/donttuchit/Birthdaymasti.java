package com.calculater.donttuchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Birthdaymasti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthdaymasti);

        TextView tv = findViewById(R.id.birthdayWish);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.arj);
        tv.setText(" "+name+"");
    }
}