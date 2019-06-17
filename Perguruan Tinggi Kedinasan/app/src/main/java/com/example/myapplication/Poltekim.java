package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Poltekim extends AppCompatActivity {
    TextView txtPoltekim1, txtPoltekim2, txtPoltekim3, txtPoltekim4;
    ImageView gambarPoltekim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poltekim);
        txtPoltekim1 = findViewById(R.id.tv_poltekim1);
        txtPoltekim2 = findViewById(R.id.tv_poltekim2);
        txtPoltekim3 = findViewById(R.id.tv_poltekim3);
        txtPoltekim4 = findViewById(R.id.tv_poltekim4);
        gambarPoltekim = findViewById(R.id.gbrPoltekim);
    }
}
