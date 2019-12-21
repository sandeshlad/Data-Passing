package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    TextView textViewUsername, textViewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textViewUsername = findViewById(R.id.txt_username);
        textViewPassword = findViewById(R.id.txt_password);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        textViewUsername.setText(username);
        textViewPassword.setText(password);
    }
}
