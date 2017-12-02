package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz3Flower extends AppCompatActivity {
    private Button primrose;
    private Button orchid;
    private Button sakura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3_flower);

        primrose = findViewById(R.id.primrose_button);
        primrose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz3Flower.this,Quiz4Flower.class);
                startActivity(intent);
            }
        });

        orchid = findViewById(R.id.orchid_button);
        orchid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz3Flower.this,Quiz4Flower.class);
                startActivity(intent);
            }
        });

        sakura = findViewById(R.id.sakura_button);
        sakura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Quiz3Flower.this,Quiz4Flower.class);
                startActivity(intent);
            }
        });
    }
}
