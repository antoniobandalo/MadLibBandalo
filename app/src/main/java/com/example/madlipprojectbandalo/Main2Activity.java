package com.example.madlipprojectbandalo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static final String MY_NAME = "name";
    public static final String MY_AGE = "age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String myName = intent.getStringExtra(MY_NAME);
        String myAge = intent.getStringExtra(MY_AGE);

        String strToDisplay = "My name is " + myName + " and I am " + myAge + " years old";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }


}
