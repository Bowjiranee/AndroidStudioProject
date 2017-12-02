package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz2Flower extends AppCompatActivity {
    private Button jasmine;
    private Button lotus;
    private Button rose;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2_flower);

        jasmine = findViewById(R.id.jasmine_button);
        jasmine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz2Flower.this,Quiz3Flower.class);
                startActivity(intent);
            }
        });

        lotus = findViewById(R.id.lotus_button);
        lotus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz2Flower.this,Quiz3Flower.class);
                startActivity(intent);
            }
        });

        rose = findViewById(R.id.rose_button);
        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz2Flower.this,Quiz3Flower.class);
                startActivity(intent);

            }
        });
    }
}
