package com.example.student_pl.myapplication.thirdlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.student_pl.myapplication.R;
import com.example.student_pl.myapplication.thirdlab.movie.Films;
import com.example.student_pl.myapplication.thirdlab.movie.Series;

public class ThirdLabMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_lab_main);
    }

    public void films(View view){
        Intent intent = new Intent(this, Films.class);
        startActivity(intent);
    }

    public void series(View view){
        Intent intent = new Intent(this, Series.class);
        startActivity(intent);
    }

}
