package com.example.myapplication;


import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {



    //view objects

    ListView listView;

    //a list to store all the artist from firebase database
    List<Kedinasan> kedinasanList;

    //our database reference object
    DatabaseReference databaseInstitusi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        databaseInstitusi = FirebaseDatabase.getInstance().getReference("INSTITUSI");



        listView = findViewById(R.id.listViewKedinasan);



         kedinasanList = new ArrayList<>();

        databaseInstitusi.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                //clearing the previous artist list
                kedinasanList.clear();

                //iterating through all the nodes
                for (DataSnapshot kedinasanSnapshot : dataSnapshot.getChildren()) {
                    //getting artist
                    Kedinasan kedinasan = kedinasanSnapshot.getValue(Kedinasan.class);
                    //adding artist to the list
                    kedinasanList.add(kedinasan);
                }

                //creating adapter
                ListKedinasan adapterKedinasan = new ListKedinasan(Home.this, kedinasanList);
                //attaching adapter to the listview
                listView.setAdapter(adapterKedinasan);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        /*
         * This method is saving a new artist to the
         * Firebase Realtime Database
         * */


    }
}