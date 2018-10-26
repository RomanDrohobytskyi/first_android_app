package com.example.student_pl.myapplication.secondlab.colors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.student_pl.myapplication.R;
import com.example.student_pl.myapplication.first.lab.arithmetic.SqrtNumb;

public class FirstNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_number);
    }

    public void firstNumber(View view){
        Intent intent = new Intent(this, SetColor.class);

        EditText editText =(EditText) findViewById(R.id.editText3);
        int number =Integer.parseInt(editText.getText().toString());
        intent.putExtra("first number", number);

        startActivity(intent);
    }
}
