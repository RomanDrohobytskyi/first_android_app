package com.example.student_pl.myapplication.first.lab.arithmetic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.student_pl.myapplication.InputNumber;
import com.example.student_pl.myapplication.R;

public class SqrtNumb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqrt_numb);
        Intent intent = getIntent();
        String number = intent.getStringExtra(InputNumber.IMIE);
        TextView textView = (TextView) findViewById(R.id.enteredNumberTextView);
        textView.setText(number);
        try {
            Integer numberInteger = Integer.parseInt(number);
            Double result = Math.pow(numberInteger, 2);
            TextView textView2 = (TextView) findViewById(R.id.calculatedSQRT);
            textView2.setText(result.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
