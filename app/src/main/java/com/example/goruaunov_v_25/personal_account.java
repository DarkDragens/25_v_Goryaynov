package com.example.goruaunov_v_25;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class personal_account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_account);
    }

    public void goBack(View v) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, Notifications.class);
        startActivity(intent);

    }
}