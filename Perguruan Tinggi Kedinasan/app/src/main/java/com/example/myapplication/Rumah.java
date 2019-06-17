package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;





public class Rumah extends AppCompatActivity {

    ImageView imgStsn,imgPoltekip,imgPoltekim, imgStin, imgStan, imgStis, imgIpdn, imgStmkg;
    Button btnStsn, btnPoltekip, btnStin, btnPoltekim, btnStan, btnStis, btnIpdn, btnStmkg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah);


        btnPoltekim = findViewById(R.id.btn_poltekim);
        btnPoltekim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rumah.this,Poltekim.class);
                startActivity(intent);
            }
        });
        btnPoltekip = findViewById(R.id.btn_poltekip);
        btnPoltekip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rumah.this,Poltekip.class);
                startActivity(intent);
            }
        });
        btnStin = findViewById(R.id.btn_stin);
        btnStin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rumah.this,Stin.class);
                startActivity(intent);
            }
        });
        btnStsn = findViewById(R.id.btn_stsn);
        btnStsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rumah.this,Stsn.class);
                startActivity(intent);
            }
        });
        imgStin = findViewById(R.id.img_stin);
        imgStsn = findViewById(R.id.img_stsn);
        imgPoltekip = findViewById(R.id.img_poltekip);
        imgPoltekim = findViewById(R.id.img_poltekim);
        imgStan = findViewById(R.id.img_stan);
        imgIpdn = findViewById(R.id.img_ipdn);
        imgStmkg = findViewById(R.id.img_stmkg);
        imgStis = findViewById(R.id.img_stis);
        btnStan = findViewById(R.id.btn_stan);
        btnStan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rumah.this,stan.class);
                startActivity(intent);
            }
        });
        btnStis = findViewById(R.id.btn_stis);
        btnStis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rumah.this,Stis.class);
                startActivity(intent);
            }
        });
        btnStmkg = findViewById(R.id.btn_stmkg);
        btnStmkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rumah.this,Stmkg.class);
                startActivity(intent);
            }
        });
        btnIpdn = findViewById(R.id.btn_ipdn);
        btnIpdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rumah.this,Ipdn.class);
                startActivity(intent);
            }
        });

    }

}
