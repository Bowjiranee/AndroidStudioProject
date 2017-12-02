package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz4Flower extends AppCompatActivity {
    private Button marigold;
    private Button hibiscus;
    private Button ixora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4_flower);

        marigold = findViewById(R.id.marigold_button);
        marigold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz4Flower.this,Quiz5Flower.class);
                startActivity(intent);
            }
        });

        hibiscus = findViewById(R.id.hibiscus_button);
        hibiscus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz4Flower.this,Quiz5Flower.class);
                startActivity(intent);
            }
        });

        ixora = findViewById(R.id.ixora_button);
        ixora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz4Flower.this,Quiz5Flower.class);
                startActivity(intent);
            }
        });
    }
}
