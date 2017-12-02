package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz2Things extends AppCompatActivity {
    private Button bag;
    private Button pen;
    private Button pencil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2_things);

        bag = findViewById(R.id.bag_button);
        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz2Things.this,Quiz3Things.class);
                startActivity(intent);
            }
        });

        pen = findViewById(R.id.pen_button);
        pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz2Things.this,Quiz3Things.class);
                startActivity(intent);
            }
        });

        pencil = findViewById(R.id.pencil_button);
        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz2Things.this,Quiz3Things.class);
                startActivity(intent);
            }
        });
    }
}
