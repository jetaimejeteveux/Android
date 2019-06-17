package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Ipdn extends AppCompatActivity {
    TextView txtIpdn1, txtIpdn2, txtIpdn3, txtIpdn4;
    ImageView gambarIpdn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipdn);
        txtIpdn1 = findViewById(R.id.tv_ipdn1);
        txtIpdn2 = findViewById(R.id.tv_ipdn2);
        txtIpdn3 = findViewById(R.id.tv_ipdn3);
        txtIpdn4 = findViewById(R.id.tv_ipdn4);
        gambarIpdn = findViewById(R.id.gbrIpdn);
    }
}
