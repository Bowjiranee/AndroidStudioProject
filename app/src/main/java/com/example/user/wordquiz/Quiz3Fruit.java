package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz3Fruit extends AppCompatActivity {
    private Button mWatermelon;
    private Button mMango;
    private Button mPineapple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3_fruit);

        mWatermelon = findViewById(R.id.watermelon_button1);
        mWatermelon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz3Fruit.this,Quiz5Fruit.class);
                startActivity(intent);
            }
        });

        mMango = findViewById(R.id.mango_button);
        mMango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz3Fruit.this,Quiz5Fruit.class);
                startActivity(intent);
            }
        });

        mPineapple = findViewById(R.id.pineapple_button);
        mPineapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz3Fruit.this,Quiz5Fruit.class);
                startActivity(intent);
            }
        });
    }
}
