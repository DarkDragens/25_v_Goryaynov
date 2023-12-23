package com.example.goruaunov_v_25;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
    }

    public void goBack(View v) {
        Intent intent = new Intent(this, personal_account.class);
        startActivity(intent);
    }
}
