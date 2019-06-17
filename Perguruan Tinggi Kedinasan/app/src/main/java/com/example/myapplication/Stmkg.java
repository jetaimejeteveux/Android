package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Stmkg extends AppCompatActivity {
    TextView txtStmkg1, txtStmkg2, txtStmkg3, txtStmkg4;
    ImageView gambarStmkg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stmkg);
        txtStmkg1 = findViewById(R.id.tv_stmkg1);
        txtStmkg2 = findViewById(R.id.tv_stmkg2);
        txtStmkg3 = findViewById(R.id.tv_stmkg3);
        txtStmkg4 = findViewById(R.id.tv_stmkg4);
        gambarStmkg = findViewById(R.id.gbrStmkg);
    }
}
