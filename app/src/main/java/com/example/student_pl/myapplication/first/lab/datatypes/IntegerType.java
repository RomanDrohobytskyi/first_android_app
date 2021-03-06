package com.example.student_pl.myapplication.first.lab.datatypes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.student_pl.myapplication.first.lab.INext;
import com.example.student_pl.myapplication.InputNumber;
import com.example.student_pl.myapplication.R;

public class IntegerType extends AppCompatActivity implements INext {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integer_type);
    }

    @Override
    public void nextExercise(View view) {
        Intent intent = new Intent(this, InputNumber.class);
        startActivity(intent);
    }
}
