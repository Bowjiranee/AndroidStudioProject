package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz5Flower extends AppCompatActivity {
    private Button zinnia;
    private Button allamanda;
    private Button bougainvillea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5_flower);

        zinnia = findViewById(R.id.zinnia_button);
        zinnia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz5Flower.this,MainActivityScore.class);
                startActivity(intent);
            }
        });

        allamanda = findViewById(R.id.allamanda_button);
        allamanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bougainvillea = findViewById(R.id.bougainvillea_button);
        bougainvillea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
