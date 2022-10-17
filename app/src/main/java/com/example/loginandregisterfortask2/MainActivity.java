package com.example.loginandregisterfortask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Views Variables
    Button loginBtn, registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialise Views
        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.signupBtn);

        // Handle Login Button
        loginBtn.setOnClickListener(view -> {
            // Intent takes user to Login Activity (GeeksforGeeks, 2019)
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        // Handle Register Button
        registerBtn.setOnClickListener(view -> {
            // Intent takes user to Register Activity (GeeksforGeeks, 2019)
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}