package com.anshansh.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Counter extends AppCompatActivity {

    Button button;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                Toast.makeText(Counter.this, "Counter Increased"+c, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Counter.this, MainActivity.class);
                intent.putExtra("Count", c);
            }
        });
    }
}