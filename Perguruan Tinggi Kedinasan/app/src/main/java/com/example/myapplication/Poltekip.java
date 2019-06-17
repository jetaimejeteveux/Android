package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Poltekip extends AppCompatActivity {
    TextView txtPoltekip1, txtPoltekip2, txtPoltekip3, txtPoltekip4;
    ImageView gambarStsn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poltekip);
        txtPoltekip1 = findViewById(R.id.tv_poltekip1);
        txtPoltekip2 = findViewById(R.id.tv_poltekip2);
        txtPoltekip3 = findViewById(R.id.tv_poltekip3);
        txtPoltekip4 = findViewById(R.id.tv_poltekip4);
        gambarStsn = findViewById(R.id.gbrPoltekip);
    }
}
