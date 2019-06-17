package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Stis extends AppCompatActivity {
    TextView txtStis1, txtStis2, txtStis3, txtStis4;
    ImageView gambarStis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stis);
        txtStis1 = findViewById(R.id.tv_stis1);
        txtStis2 = findViewById(R.id.tv_stis2);
        txtStis3 = findViewById(R.id.tv_stis3);
        txtStis4 = findViewById(R.id.tv_stis4);
        gambarStis = findViewById(R.id.gbrStis);
    }
}
