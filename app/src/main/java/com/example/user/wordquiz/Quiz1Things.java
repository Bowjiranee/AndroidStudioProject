package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz1Things extends AppCompatActivity {
    private Button bed;
    private Button ruler;
    private Button eraser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1_things);

        bed = findViewById(R.id.eraser_button);
        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1Things.this,Quiz2Things.class);
                startActivity(intent);
            }
        });

        ruler = findViewById(R.id.ruler_button);
        ruler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1Things.this,Quiz2Things.class);
                startActivity(intent);
            }
        });

        eraser = findViewById(R.id.eraser_button);
        eraser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz1Things.this,Quiz2Things.class);
                startActivity(intent);
            }
        });
    }
}
