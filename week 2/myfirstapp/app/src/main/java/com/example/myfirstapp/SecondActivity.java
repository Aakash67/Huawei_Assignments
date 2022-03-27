package com.example.myfirstapp;


import android.content.Intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity");

        //intent to get data
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String age = intent.getStringExtra("AGE");
        String phone = intent.getStringExtra("PHONE");
        String bio = intent.getStringExtra("BIO");
        String location = intent.getStringExtra("LOCATION");


        //TextView
        TextView mResultTv = findViewById(R.id.resultTv);

        //setText
        mResultTv.setText("Name: "+name+"\nAge: "+age+ "\nPhone: "+phone+ "\nBio: "+bio+ "\nLocation: "+location);

    }
}