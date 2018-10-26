package com.example.student_pl.myapplication.secondlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.student_pl.myapplication.R;
import com.example.student_pl.myapplication.secondlab.colors.Colors;
import com.example.student_pl.myapplication.secondlab.colors.ColorsCmyk;
import com.example.student_pl.myapplication.secondlab.colors.FirstNumber;
import com.example.student_pl.myapplication.secondlab.mylist.MyList;
import com.example.student_pl.myapplication.secondlab.mylist.RandomList;

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
        Intent intent = new Intent(this, ColorsCmyk.class);
        startActivity(intent);
    }

    public void goFirstNumber(View view){
        Intent intent = new Intent(this, FirstNumber.class);
        startActivity(intent);
    }

    public void myList(View view){
        Intent intent = new Intent(this, MyList.class);
        startActivity(intent);
    }


    public void randomNumbs(View view){
        Intent intent = new Intent(this, RandomList.class);
        startActivity(intent);
    }

}
