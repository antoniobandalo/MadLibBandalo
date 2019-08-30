package com.example.madlipprojectbandalo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static final String MY_ADJ = "adjective";
    public static final String MY_NOUN = "noun";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String userAdj = intent.getStringExtra(MY_ADJ);
        String userNoun = intent.getStringExtra(MY_NOUN);
        String userAnimal = intent.getStringExtra(MY_ANIMAL);
        String userNumber = intent.getStringExtra(MY_NUMBER);

        String strToDisplay = "Once upon a time there was a " + userAdj + " Lizard. ";
        strToDisplay += "He used his super powers to create an online network called " + userNoun;
        strToDisplay += ". One day when he was only " + userNumber + " years old, he was smoking meats and accidentally smoked his " + userAnimal + ".";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }


}
