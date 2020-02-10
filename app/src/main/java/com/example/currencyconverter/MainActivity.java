package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
    EditText textEntered = findViewById(R.id.text);
    String entry = textEntered.getText().toString();
    String result;

    //Determines if an Integer or Double was entered.
    try{
        Integer dollars = Integer.parseInt(entry);

        Double pounds = dollars * .77;
        result = pounds.toString();
    } catch(Exception e) {
        Double dollars = Double.parseDouble(entry);
        Double pounds = Math.round(dollars * 77.0)/100.0;

        result = pounds.toString();
    }

    goToActivity2(result);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
