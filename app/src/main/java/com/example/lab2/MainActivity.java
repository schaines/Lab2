package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToActivity2(int result){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", Integer.toString(result));
        startActivity(intent);
    }

    public void addition(View view) {
        EditText firstText = (EditText) findViewById(R.id.editTextNumber1);
        int firstNumber = Integer.parseInt(firstText.getText().toString());

        EditText secondText = (EditText) findViewById(R.id.editTextNumber2);
        int secondNumber = Integer.parseInt(secondText.getText().toString());

        int result = firstNumber + secondNumber;
        goToActivity2(result);

    }

    public void subtraction(View view) {
        EditText firstText = (EditText) findViewById(R.id.editTextNumber1);
        int firstNumber = Integer.parseInt(firstText.getText().toString());

        EditText secondText = (EditText) findViewById(R.id.editTextNumber2);
        int secondNumber = Integer.parseInt(secondText.getText().toString());

        int result = firstNumber - secondNumber;
        goToActivity2(result);
    }

    public void multiplication(View view) {
        EditText firstText = (EditText) findViewById(R.id.editTextNumber1);
        int firstNumber = Integer.parseInt(firstText.getText().toString());

        EditText secondText = (EditText) findViewById(R.id.editTextNumber2);
        int secondNumber = Integer.parseInt(secondText.getText().toString());

        int result = firstNumber * secondNumber;
        goToActivity2(result);
    }

    public void division(View view) {
        EditText firstText = (EditText) findViewById(R.id.editTextNumber1);
        int firstNumber = Integer.parseInt(firstText.getText().toString());

        EditText secondText = (EditText) findViewById(R.id.editTextNumber2);
        int secondNumber = Integer.parseInt(secondText.getText().toString());

        int result = firstNumber / secondNumber;
        goToActivity2(result);
    }
}