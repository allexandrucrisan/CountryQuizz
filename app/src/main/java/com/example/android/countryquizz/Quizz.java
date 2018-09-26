package com.example.android.countryquizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quizz extends AppCompatActivity {

    int finalResult = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
    }

    public void verifyAnswers(View view) {
        //Question 1
        RadioButton radioButton = findViewById(R.id.radio1C);
        if (radioButton.isChecked()) {
            finalResult += 100;
        }

        //Question 2
        EditText textQ2= findViewById(R.id.numberOfCountries);
        if(textQ2.getText().toString().equals("195")) {
            finalResult += 100;
        }

        //Question 3
        CheckBox checkAnswer3A = findViewById(R.id.checkBox3A);
        if (checkAnswer3A.isChecked()) {
            finalResult += 50;
        }
        CheckBox checkAnswer3B = findViewById(R.id.checkBox3B);
        if (checkAnswer3B.isChecked()) {
            finalResult += 50;
        }

        //Question 4
        CheckBox checkAnswer4A = findViewById(R.id.checkBox4A);
        if (checkAnswer4A.isChecked()) {
            finalResult += 25;
        }
        CheckBox checkAnswer4B = findViewById(R.id.checkBox4B);
        if (checkAnswer4B.isChecked()) {
            finalResult += 25;
        }
        CheckBox checkAnswer4C = findViewById(R.id.checkBox4C);
        if (checkAnswer4C.isChecked()) {
            finalResult += 25;
        }
        CheckBox checkAnswer4D = findViewById(R.id.checkBox4D);
        if (checkAnswer4D.isChecked()) {
            finalResult += 25;
        }

        System.out.println(finalResult);
    }

    }


