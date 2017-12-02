package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz4Fruit extends AppCompatActivity {
    private Button mPomegranate;
    private Button mMango;
    private Button mLychee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4_fruit);

        mPomegranate = findViewById(R.id.pomegranate_button);
        mPomegranate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMango = findViewById(R.id.mango_button1);
        mMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Quiz4Fruit.this,QuizFruit.class);
//                startActivity(intent);
            }
        });

        mLychee = findViewById(R.id.Lychee_button);
        mLychee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
