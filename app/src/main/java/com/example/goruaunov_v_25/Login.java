package com.example.goruaunov_v_25;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, personal_account.class);
        startActivity(intent);
        btn = findViewById(R.id.button3);
    }

}
