package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz1Flower extends AppCompatActivity {
    private Button lily;
    private Button sunflower;
    private Button carnation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1_flower);

        lily = findViewById(R.id.lily_button);
        lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1Flower.this,Quiz2Flower.class);
                startActivity(intent);
            }
        });

        sunflower = findViewById(R.id.sunflower_button);
        sunflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1Flower.this,Quiz2Flower.class);
                startActivity(intent);
            }
        });

        carnation = findViewById(R.id.carnation_button);
        carnation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1Flower.this,Quiz2Flower.class);
                startActivity(intent);
            }
        });
    }
}
