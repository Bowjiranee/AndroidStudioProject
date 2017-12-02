package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Quiz2Fruit extends AppCompatActivity {
    private Button mBanana;
    private Button mGrapes;
    private Button mWatermelon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2_fruit);

        mBanana = findViewById(R.id.banana_button1);
        mBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz2Fruit.this,Quiz3Fruit.class);
                startActivity(intent);
            }
        });

        mGrapes = findViewById(R.id.grapes_button);
        mGrapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz2Fruit.this,Quiz3Fruit.class);
                startActivity(intent);
            }
        });

        mWatermelon = findViewById(R.id.watermelon_button);
        mWatermelon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz2Fruit.this,Quiz3Fruit.class);
                startActivity(intent);
            }
        });



    }
}
