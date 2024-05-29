package com.calculater.calculationconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

   public Button bm11,bm12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bm11 = findViewById(R.id.bm11);
        bm12 = findViewById(R.id.bm12);
       bm11.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity2.this,MainActivity3_Circle.class);
                startActivity(intent2);
            }
        });
       bm12.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent12 = new Intent(MainActivity2.this,MainActivity3_Triangle.class);
               startActivity(intent12);
           }
       });


    }
}