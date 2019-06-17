package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Detail extends AppCompatActivity {

    Button btSubmit;
    EditText edtNama;
    EditText edtAlamat;
    EditText edtTentang;
    EditText    edtWeb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        edtNama = findViewById(R.id.nama_institusi);
        edtAlamat = findViewById(R.id.alamat_institusi);
        edtTentang =  findViewById(R.id.tentang_institusi);
        edtWeb = findViewById(R.id.website_institusi);

        edtNama.setEnabled(false);
        edtAlamat.setEnabled(false);
        edtTentang.setEnabled(false);
        edtWeb.setEnabled(false);
        btSubmit.setVisibility(View.GONE);

        Kedinasan kedinasan = (Kedinasan) getIntent().getSerializableExtra("Institusi");
        if(kedinasan!=null){
            edtNama.setText(kedinasan.getInstitusiNama());
            edtAlamat.setText(kedinasan.getInstitusiAlamat());
            edtTentang.setText(kedinasan.getInstitusiTentang());
            edtWeb.setText(kedinasan.getInstitusiWeb());
        }
    }

    public static Intent getActIntent(Activity activity){
        return new Intent(activity, Detail.class);
    }
}