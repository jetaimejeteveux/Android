package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class stan extends AppCompatActivity {
    TextView txtStan1, txtStan2, txtStan3, txtStan4;
    ImageView gambarStan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stan);
        txtStan1 = findViewById(R.id.tv_stan1);
        txtStan2 = findViewById(R.id.tv_stan2);
        txtStan3 = findViewById(R.id.tv_stan3);
        txtStan4 = findViewById(R.id.tv_stan4);
        gambarStan = findViewById(R.id.gbrStan);
    }
}
