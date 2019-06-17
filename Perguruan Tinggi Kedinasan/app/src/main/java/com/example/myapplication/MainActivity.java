package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button btnLogin,btnSignUp,btnAddData;
    ImageView imgView1,imgView2,imgView3,imgView4;
    TextView txtemail,txtpassword;
    EditText edtpwLogin,edtemailLogin;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBarLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtemailLogin = findViewById(R.id.edt_emaillogin);
        txtemail = findViewById(R.id.tv1);
        txtpassword = findViewById(R.id.tv2);
        edtpwLogin = findViewById(R.id.edt_pw);
        imgView1 = findViewById(R.id.gambar1);
        imgView2 = findViewById(R.id.gambar2);
        imgView3 = findViewById(R.id.gambar3);
        imgView4 = findViewById(R.id.gambar4);
        btnLogin = findViewById(R.id.btnLogin);
        btnAddData = findViewById(R.id.btnAddData);
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtemailLogin.equals("admin")&&edtpwLogin.equals("adminadmin")) {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,dataRegistration.class);
                    startActivity(intent);
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau password Anda Salah").setNegativeButton("retry", null).create().show();

                }

            }
        });
        firebaseAuth = firebaseAuth.getInstance();
        btnSignUp = findViewById(R.id.btnRegisterLogin);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity.this,Register.class);
                startActivity(intent);
            }
        });
        progressBarLogin = findViewById(R.id.progressBarLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBarLogin.setVisibility(View.VISIBLE);

                firebaseAuth.signInWithEmailAndPassword(edtemailLogin.getText().toString(),edtpwLogin.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBarLogin.setVisibility(View.GONE);
                        if(task.isSuccessful()){
                            Intent intent = new Intent(MainActivity.this,Rumah.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(MainActivity.this,task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });

    }
}
