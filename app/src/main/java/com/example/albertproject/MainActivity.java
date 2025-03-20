package com.example.albertproject;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;
    EditText et1;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        btn1 = findViewById(R.id.btn1);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        Random rnd = new Random();
        int random1 = rnd.nextInt(89) + 10;
        int random2 = rnd.nextInt(89) + 10;
        int correct_answer = random1+random2;
        textView.setText(String.valueOf(random1));
        textView2.setText(String.valueOf(random2));
    }
}
