package com.example.student_pl.myapplication.secondlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.student_pl.myapplication.R;
import com.example.student_pl.myapplication.first.lab.FirstMain;
import com.example.student_pl.myapplication.secondlab.colors.Colors;

public class SecondLabMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_lab_main);
    }

    public void rgbColor(View view){
        Intent intent = new Intent(this, Colors.class);
        startActivity(intent);
    }

    public void cmykColor(View view){
        Intent intent = new Intent(this, Colors.class);
        startActivity(intent);
    }
}
