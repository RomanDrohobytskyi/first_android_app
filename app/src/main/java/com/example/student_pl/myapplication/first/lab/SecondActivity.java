package com.example.student_pl.myapplication.first.lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.student_pl.myapplication.InputNumber;
import com.example.student_pl.myapplication.MainActivity;
import com.example.student_pl.myapplication.R;
import com.example.student_pl.myapplication.constants.Constants;
import com.example.student_pl.myapplication.first.lab.datatypes.DoubleType;
import com.example.student_pl.myapplication.first.lab.datatypes.IntegerType;
import com.example.student_pl.myapplication.first.lab.datatypes.StringType;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        try {
            TextView textView = findViewById(R.id.nameTextView);
            String firstName;
            if (savedInstanceState == null) {
                Bundle extras = getIntent().getExtras();
                if (extras == null) {
                    firstName = null;
                } else {
                    firstName = extras.getString(Constants.FIRST_MAIN);
                }
            } else {
                firstName = (String) savedInstanceState.getSerializable(Constants.FIRST_MAIN);
            }
            if (firstName.isEmpty()) {
                textView.setText(Constants.EMPTY_VIEW);
            }
            else
                textView.setText(firstName);

        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public void integerType(View view){
        Intent intent = new Intent(this, IntegerType.class);
        startActivity(intent);
    }

    public void doubleType(View view){
        Intent intent = new Intent(this, DoubleType.class);
        startActivity(intent);
    }

    public void stringType(View view){
        Intent intent = new Intent(this, StringType.class);
        startActivity(intent);
    }

    public void goIntoEnterNumber(View view){
        Intent intent = new Intent(this, InputNumber.class);
        startActivity(intent);
    }
}
