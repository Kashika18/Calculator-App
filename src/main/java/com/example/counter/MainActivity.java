package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e;
    Button b;
    Button c;
    Button d;
    Button f;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.editTextTextPersonName7);
        EditText g = (EditText) findViewById(R.id.editTextTextPersonName6);
        EditText h = (EditText) findViewById(R.id.editTextTextPersonName5);
        b = (Button) findViewById(R.id.button);
        c = (Button) findViewById(R.id.button2);
        d = (Button) findViewById(R.id.button3);
        f = (Button) findViewById(R.id.button4);


        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String s = e.getText().toString();
                String x = g.getText().toString();

                if((TextUtils.isEmpty(s))||(TextUtils.isEmpty(x))){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_LONG).show();
                }
                else{

                double n = Double.parseDouble(s);
                double m= Double.parseDouble(x);

                h.setText(n+m+"");}
            }}
        );
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String s = e.getText().toString();
                String x = g.getText().toString();

                if((TextUtils.isEmpty(s))||(TextUtils.isEmpty(x))){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_LONG).show();
                }
                else{

                    double n = Double.parseDouble(s);
                    double m= Double.parseDouble(x);

                    h.setText(n-m+"");}
            }
        });

        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String s = e.getText().toString();
                String x = g.getText().toString();

                if((TextUtils.isEmpty(s))||(TextUtils.isEmpty(x))){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_LONG).show();
                }
                else{

                    double n = Double.parseDouble(s);
                    double m= Double.parseDouble(x);

                    h.setText(n*m+"");}
            }
        });

        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                String s = e.getText().toString();
                String x = g.getText().toString();

                if((TextUtils.isEmpty(s))||(TextUtils.isEmpty(x))){
                    Toast.makeText(MainActivity.this,"Enter a number", Toast.LENGTH_LONG).show();
                }
                else{

                    double n = Double.parseDouble(s);
                    double m= Double.parseDouble(x);

                    h.setText(n/m+"");}
            }
        });




    }
}