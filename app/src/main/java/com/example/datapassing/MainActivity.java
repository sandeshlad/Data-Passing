package com.example.datapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.send);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // convert edittext value to string
                String USERNAME = username.getText().toString();
                String PASSWORD = password.getText().toString();

                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                intent.putExtra("username",USERNAME);
                intent.putExtra("password",PASSWORD);
                startActivity(intent);

            }
        });


    }
}
