package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class registerdone extends AppCompatActivity {
    TextView tvWelcome,tvBack;
            Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerdone);
        tvWelcome = findViewById(R.id.tvwelcome);
                tvBack = findViewById(R.id.tvback);
                btnBack = findViewById(R.id.btnBack);
                btnBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent (registerdone.this,MainActivity.class);
                        startActivity(intent);
                    }
                });
    }
}
