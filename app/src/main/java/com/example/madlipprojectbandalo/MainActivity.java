package com.example.madlipprojectbandalo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v){

        // getting a reference to my edit text fields
        EditText userAdj = (EditText) findViewById(R.id.userAdj);
        EditText userNoun = (EditText) findViewById(R.id.userNoun);
        EditText userAnimal = (EditText) findViewById(R.id.userAnimal);
        EditText userNumber = (EditText) findViewById(R.id.userNumber);

        // extracting the text from those edit text fields
        String myAdjStr = userAdj.getText().toString();
        String myNounStr = userNoun.getText().toString();
        String myAnimalStr = userAnimal.getText().toString();
        String myNumberStr = userNumber.getText().toString();


        // creating the intent object so i can send data
        Intent intent = new Intent(this, Main2Activity.class);

        // putting data from edit text fields into intent to send to other activity
        // MY_NAME and MY_AGE are constants in infoActivity class
        intent.putExtra(Main2Activity.MY_ADJ, myAdjStr);
        intent.putExtra(Main2Activity.MY_NOUN, myNounStr);
        intent.putExtra(Main2Activity.MY_ANIMAL, myAnimalStr);
        intent.putExtra(Main2Activity.MY_NUMBER, myNumberStr);

        startActivity(intent);
    }

    /* public void shareInfo(View v){

        // getting a reference to my edit text fields
        EditText name = (EditText) findViewById(R.id.name);
        EditText age = (EditText) findViewById(R.id.age);

        // extracting the text from those edit text fields
        String myNameStr = name.getText().toString();
        String myAgeStr = age.getText().toString();

        String myMessage = "My name is " + myNameStr + " and I am " + myAgeStr + " years old.";

        // creating the intent object so i can send data
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);

        startActivity(chosenIntent);
    } */
}
