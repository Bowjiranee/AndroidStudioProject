package com.example.user.wordquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button mFruit;
    private Button mFlower;
    private Button mThings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mFruit = findViewById(R.id.fruit_button);
        mFlower = findViewById(R.id.flower_button);
        mThings = findViewById(R.id.things_button);

        mFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Quiz1Fruit.class);
                startActivity(intent);
            }
        });

        mFlower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Quiz1Flower.class);
                startActivity(intent);

            }
        });

        mThings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Quiz1Things.class);
                startActivity(intent);

            }
        });
    }
}
