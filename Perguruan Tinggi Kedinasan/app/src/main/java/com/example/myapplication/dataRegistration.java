package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class dataRegistration extends AppCompatActivity {


    EditText namaInst,alamatInst,tentangInst,websiteInst;
    Button   addData;

    DatabaseReference databaseInstitusi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_registration);
        namaInst = findViewById(R.id.nama_institusi);
        databaseInstitusi = FirebaseDatabase.getInstance().getReference("institusi");
        alamatInst = findViewById(R.id.alamat_institusi);
        tentangInst = findViewById(R.id.tentang_institusi);
        websiteInst = findViewById(R.id.website_institusi);
        addData = findViewById(R.id.addData);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            addInstitusi();
            }
        });
    }
    private void addInstitusi() {
        String nama = namaInst.getText().toString().trim();
        String alamat = alamatInst.getText().toString().trim();
        String tentang = tentangInst.getText().toString().trim();
        String website = websiteInst.getText().toString().trim();
        if(!TextUtils.isEmpty(nama)&&!TextUtils.isEmpty(alamat)&&!TextUtils.isEmpty(tentang)&&!TextUtils.isEmpty(website)) {
            String id = databaseInstitusi.push().getKey();

            Kedinasan kedinasan = new Kedinasan(id, nama, alamat, tentang, website);
            databaseInstitusi.child(id).setValue(kedinasan);
            Toast.makeText(this, "Kedinasan telah Ditambahkan",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Harus Diisi",Toast.LENGTH_LONG).show();
        }
    }
}
