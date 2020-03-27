package com.example.lab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText msg;
    Button send; public static final String EXTRA_MESSAGE =  "com.example.lab3_1.Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.ET1msg);
        send = findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendMessage = new Intent(MainActivity.this,textview.class);
                String message = msg.getText().toString();

                sendMessage.putExtra(EXTRA_MESSAGE,message);
                startActivity(sendMessage);


            }
        });
    }
}
