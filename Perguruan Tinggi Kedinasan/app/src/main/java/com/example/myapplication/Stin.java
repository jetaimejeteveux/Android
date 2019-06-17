package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Stin extends AppCompatActivity {
    TextView txtStin1, txtStin2, txtStin3, txtStin4;
    ImageView gambarStsn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stin);
        txtStin1 = findViewById(R.id.tv_stin1);
        txtStin2 = findViewById(R.id.tv_stin2);
        txtStin3 = findViewById(R.id.tv_stin3);
        txtStin4 = findViewById(R.id.tv_stin4);
        gambarStsn = findViewById(R.id.gbrStin);
    }
}
