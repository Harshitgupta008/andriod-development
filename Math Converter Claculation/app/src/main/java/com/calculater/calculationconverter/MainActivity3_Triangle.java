package com.calculater.calculationconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3_Triangle extends AppCompatActivity {

    Button button2t;
    TextView  ta1, ta2, ta3;
    EditText editNumber1,editNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_triangle);
        button2t = findViewById(R.id.button2t);
        //Area
        ta1 = findViewById(R.id.ta1);
        //Hypotenuse
        ta2 = findViewById(R.id.ta2);
        //perimeter
        ta3 = findViewById(R.id.ta3);
        //a
        editNumber1 = findViewById(R.id.editNumber1);
        //b
        editNumber2 = findViewById(R.id.editNumber2);
        button2t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String en1 = editNumber1.getText().toString() ;
                String en2 = editNumber2.getText().toString();
                float a = Integer.parseInt(en1);
                float b = Integer.parseInt(en2);

                float area = (a*b)/2;
                float hypotenuse = (a*a)+(b*b);
                double perimeter = a+b+Math.sqrt(hypotenuse);

                ta1.setText(""+area+"");
                ta2.setText(""+Math.sqrt(hypotenuse)+"");
                ta3.setText(""+perimeter+"");

            }
        });
    }
}