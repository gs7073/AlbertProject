package com.example.albertproject;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;
    EditText et1;
    Button btn1;
    ImageView image_result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        btn1 = findViewById(R.id.btn1);
        image_result = findViewById(R.id.image_result2);

        textView = findViewById(R.id.textView3);
        textView2 = findViewById(R.id.textView4);

        Random rnd = new Random();
        int random1 = rnd.nextInt(89) + 10;
        int random2 = rnd.nextInt(89) + 10;
        int correct_answer = random1+random2;
        textView.setText(String.valueOf(random1));
        textView2.setText(String.valueOf(random2));


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answerText = et1.getText().toString();
                if (!answerText.isEmpty()) {
                    int answer = Integer.parseInt(answerText);
                    if (answer == correct_answer) {
                        image_result.setImageResource(R.drawable.v);
                    } else {
                        image_result.setImageResource(R.drawable.x);
                    }

                    image_result.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
