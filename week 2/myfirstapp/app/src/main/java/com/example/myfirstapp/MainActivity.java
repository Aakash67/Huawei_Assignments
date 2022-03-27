package com.example.myfirstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //actionbar title
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");

        //EditText
        final EditText mNameEt = findViewById(R.id.nameEt);
        final EditText mAgeEt = findViewById(R.id.ageEt);
        final EditText mPhoneEt = findViewById(R.id.phoneEt);
        final EditText mBioEt = findViewById(R.id.BioEt);
        final EditText mLocEt = findViewById(R.id.LocEt);
        //Button
        Button mSaveBtn = findViewById(R.id.saveBtn);

        //button click listener
        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from edit text
                String name = mNameEt.getText().toString();
                String age = mAgeEt.getText().toString();
                String phone = mPhoneEt.getText().toString();
                String Bio = mBioEt.getText().toString();
                String Location = mLocEt.getText().toString();



                //activity intent
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("AGE", age);
                intent.putExtra("PHONE", phone);
                intent.putExtra("BIO", Bio);
                intent.putExtra("LOCATION", Location);

                startActivity(intent);

            }
        });
    }
}