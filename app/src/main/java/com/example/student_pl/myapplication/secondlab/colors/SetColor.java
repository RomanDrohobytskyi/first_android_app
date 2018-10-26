package com.example.student_pl.myapplication.secondlab.colors;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.student_pl.myapplication.InputNumber;
import com.example.student_pl.myapplication.R;

public class SetColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_color);

        Intent intent = getIntent();
        int number = intent.getIntExtra("first number", 0);
        TextView textView = (TextView) findViewById(R.id.textView10);
        if (checkIfFirst(number)){
            textView.setText("Number:" + number + " is first number!");
            textView.setTextColor(Color.RED);
        }
        else {
            textView.setText("Number:" + number + " is`n first number!");
            textView.setTextColor(Color.GREEN);
        }
    }

    public boolean checkIfFirst(int number){
        if (number < 2){
            return false;
        }
        for(int i = 2; i * i <= number ;i++)
            if(number % i == 0){
                return false;
            }
        return true;
    }
}
