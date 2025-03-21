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
    TextView textView, textView2, textView3, textView4, textView5, textView6;
    EditText et1, et2, et3;
    Button btn1, btn2, btn3, btn4;
    ImageView image_result, image_result2, image_result3;
    int score = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        image_result = findViewById(R.id.image_result);
        image_result2 = findViewById(R.id.image_result2);
        image_result3 = findViewById(R.id.image_result3);


        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);



        Random rnd = new Random();
        int random1 = rnd.nextInt(89) + 10;
        int random2 = rnd.nextInt(89) + 10;
        int correct_answer = random1+random2;
        textView.setText(String.valueOf(random1));
        textView2.setText(String.valueOf(random2));
        int random3 = rnd.nextInt(90) + 10;
        int correct_answer2 = random3 + correct_answer;
        int random5 = rnd.nextInt(90) + 10;
        int correct_answer3 = random5 + correct_answer2;



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answerText = et1.getText().toString();
                if (!answerText.isEmpty()) {
                    int answer = Integer.parseInt(answerText);
                    if (answer == correct_answer) {
                        image_result.setImageResource(R.drawable.v);
                        score++;

                    } else {
                        image_result.setImageResource(R.drawable.x);
                    }

                    image_result.setVisibility(View.VISIBLE);
                    textView3.setText(String.valueOf(correct_answer));
                    textView4.setText(String.valueOf(random3));
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    et2.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);



                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answerText = et2.getText().toString();
                if (!answerText.isEmpty()) {
                    int userAnswer = Integer.parseInt(answerText);
                    if (userAnswer == correct_answer2) {
                        image_result2.setImageResource(R.drawable.v);
                        score++;
                    } else {
                        image_result2.setImageResource(R.drawable.x);
                    }
                    image_result2.setVisibility(View.VISIBLE);
                    textView5.setText(String.valueOf(correct_answer2));
                    textView6.setText(String.valueOf(random5));
                    textView5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.VISIBLE);
                    et3.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);

                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answerText = et3.getText().toString();
                if (!answerText.isEmpty()) {
                    int userAnswer = Integer.parseInt(answerText);
                    if (userAnswer == correct_answer3) {
                        image_result3.setImageResource(R.drawable.v);
                        score++;
                    } else {
                        image_result3.setImageResource(R.drawable.x);
                    }
                    image_result3.setVisibility(View.VISIBLE);
                    btn4.setText("Score: " + score + "/3 (" + (score * 100 / 3) + "%)");

                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;

                Random rnd = new Random();
                int random1 = rnd.nextInt(89) + 10;
                int random2 = rnd.nextInt(89) + 10;
                int correct_answer = random1 + random2;
                int random3 = rnd.nextInt(89) + 10;
                int correct_answer2 = random3 + correct_answer;
                int random5 = rnd.nextInt(89) + 10;
                int correct_answer3 = random5 + correct_answer2;

                textView.setText(String.valueOf(random1));
                textView2.setText(String.valueOf(random2));

                textView3.setVisibility(View.INVISIBLE);
                textView4.setVisibility(View.INVISIBLE);
                textView5.setVisibility(View.INVISIBLE);
                textView6.setVisibility(View.INVISIBLE);

                et1.setText("");
                et2.setText("");
                et3.setText("");
                et2.setVisibility(View.INVISIBLE);
                et3.setVisibility(View.INVISIBLE);

                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                image_result.setVisibility(View.INVISIBLE);
                image_result2.setVisibility(View.INVISIBLE);
                image_result3.setVisibility(View.INVISIBLE);

                btn4.setText("New");
            }
        });

    }

    }

