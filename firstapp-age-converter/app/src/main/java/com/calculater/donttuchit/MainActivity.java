package com.calculater.donttuchit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private Button  button;
    private EditText editText;
    private TextView textView;

    public static final String arj = "com.calculater.donttuchit.arj" ;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button button = findViewById(R.id.createBirthdayButton);
       EditText editText = findViewById(R.id.editTextNumber);
        TextView textView = findViewById(R.id.textView3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this, " Thanks for using this app ", Toast.LENGTH_SHORT).show();
                String sg = editText.getText().toString();
//                Intent intent = new Intent(MainActivity.this,Birthdaymasti.class);
//                intent.putExtra(arj,sg);
//                startActivity(intent);
                int year = Integer.parseInt(sg);
                int age = 2024 - year;
                if(year <= 2023 && year >=1900)
                {
                    textView.setText(" you are " + age + " years old now ");
                }
                else if(year <=122 && year >= 0)
                {
                    textView.setText("Your birth of year " + age);
                }
                else
                {
                    textView.setText("Enter your valid age/Year ");
                }
            }
        });



    }
}