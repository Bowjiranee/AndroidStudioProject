package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Quiz1Fruit extends AppCompatActivity {
    private Button mOrange;
    private Button mPitaya;
    private Button mApple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1_fruit);

        mOrange = findViewById(R.id.orange_button);
        mOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz1Fruit.this,Quiz2Fruit.class);
                startActivity(intent);
            }
        });

        mPitaya = findViewById(R.id.pitaya_button);
        mPitaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz1Fruit.this,Quiz2Fruit.class);
                startActivity(intent);

            }
        });

        mApple = findViewById(R.id.apple_button);
        mApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz1Fruit.this,Quiz2Fruit.class);
                startActivity(intent);
            }
        });
    }
}
