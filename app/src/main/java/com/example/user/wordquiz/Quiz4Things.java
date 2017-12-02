package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz4Things extends AppCompatActivity {
    private Button mBlanket;
    private Button mNotebook;
    private Button mShelves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4_things);

        mBlanket = findViewById(R.id.blanket_button);
        mBlanket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz4Things.this,Quiz5Things.class);
                startActivity(intent);
            }
        });

        mNotebook = findViewById(R.id.notebook_button);
        mNotebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz4Things.this,Quiz5Things.class);
                startActivity(intent);
            }
        });

        mShelves = findViewById(R.id.shelves_button);
        mShelves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz4Things.this,Quiz5Things.class);
                startActivity(intent);
            }
        });
    }
}
