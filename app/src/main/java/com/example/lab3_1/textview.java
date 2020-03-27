package com.example.lab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class textview extends AppCompatActivity {

    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);

        view = findViewById(R.id.textView);
        Intent received = getIntent();
        String displayMessage = received.getStringExtra(MainActivity.EXTRA_MESSAGE);
        view.setText(displayMessage);
    }
}
