package com.calculater.calculationconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3_Circle extends AppCompatActivity {

    Button bm23,bm21;
    TextView t5;
    EditText edit1,edit2,edit3,edit4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_circle);
        bm21 = findViewById(R.id.bm21);
        bm23 = findViewById(R.id.bm23);
        //Radius
        edit1 = findViewById(R.id.edit1);
        //Diameter
        edit2 = findViewById(R.id.edit2);
        //Circumference or Perimeter
        edit3 = findViewById(R.id.edit3);
        //Area
        edit4 = findViewById(R.id.edit4);
        t5 = findViewById(R.id.t5);
        //calculate circle
        bm21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String sg = edit1.getText().toString();
                    float radius = Integer.parseInt(sg);

                    float diameter = (2 * radius);
                    edit2.setText("" + diameter + "");

                    float perimeter = 2 * 3.14f * radius;
                    edit3.setText("" + perimeter + "");

                    float area = 3.14f * radius * radius;
                    edit4.setText("" + area + "");


//                bm21.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        String hg = edit2.getText().toString();
//                        float diameter1 = Integer.parseInt(hg);
//                        float radius1 = diameter1/2;
//                        edit1.setText(""+radius1+"");
//                        float perimeter1 = 3.14f * diameter1;
//                        edit3.setText("" + perimeter1 + "");
//
//
//
//                    }
//                });


            }
        });

        //Info of circle
        bm23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity3_Circle.this,MainActivity3_Circle2_info.class);
                startActivity(intent3);
            }
        });


    }
}
