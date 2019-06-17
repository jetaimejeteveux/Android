package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Stsn extends AppCompatActivity {
    TextView txtStsn1, txtStsn2, txtStsn3, txtStsn4;
    ImageView gambarStsn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stsn);
        txtStsn1 = findViewById(R.id.tv_stsn1);
        txtStsn2 = findViewById(R.id.tv_stsn2);
        txtStsn3 = findViewById(R.id.tv_stsn3);
        txtStsn4 = findViewById(R.id.tv_stsn4);
        gambarStsn = findViewById(R.id.gbrStsn);
    }
}
