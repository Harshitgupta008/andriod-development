package co.in.hexane.aa_practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    public static final String ark = "co.in.hexane.aa_practice2.ark";

    TextView tv,alradyac;
    Button but;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = findViewById(R.id.but);
        et = findViewById(R.id.et);
        tv = findViewById(R.id.tv);
        alradyac = findViewById(R.id.alradyac);

        //fragment...............
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st = et.getText().toString();
                Pattern pr = Pattern.compile("[A-Za-z ]{3,14}+");
                Matcher mt = pr.matcher(st);
                if(mt.find())
                {

                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra(ark,st);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Fragment", Toast.LENGTH_SHORT).show();
                }else
                {
                    tv.setText("some thing else");
                }


            }
        });
        //Login account..............
        alradyac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,loginActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "now you can login your account", Toast.LENGTH_SHORT).show();
            }
        });




    }
}