package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz3Things extends AppCompatActivity {
    private Button lump;
    private Button book;
    private Button hat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3_things);

        lump = findViewById(R.id.lump_button);
        lump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz3Things.this,Quiz4Things.class);
                startActivity(intent);
            }
        });

        book = findViewById(R.id.book_button);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz3Things.this,Quiz4Things.class);
                startActivity(intent);
            }
        });

        hat = findViewById(R.id.hat_button);
        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz3Things.this,Quiz4Things.class);
                startActivity(intent);
            }
        });
    }
}
