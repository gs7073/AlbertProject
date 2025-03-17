package com.example.albertproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        Random rnd = new Random();
        int random1 = rnd.nextInt(89) + 10;
        int random2 = rnd.nextInt(89) + 10;

        textView.setText(String.valueOf(random1));
        textView2.setText(String.valueOf(random2));
    }
}
