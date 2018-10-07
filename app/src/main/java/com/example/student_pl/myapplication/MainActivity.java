package com.example.student_pl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.student_pl.myapplication.first.lab.FirstMain;
import com.example.student_pl.myapplication.secondlab.SecondLabMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstLab(View view){
        Intent intent = new Intent(this, FirstMain.class);
        startActivity(intent);
    }

    public void secondLab(View view){
        Intent intent = new Intent(this, SecondLabMain.class);
        startActivity(intent);
    }
}
