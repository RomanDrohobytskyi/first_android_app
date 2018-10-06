package com.example.student_pl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.student_pl.myapplication.first.lab.arithmetic.SqrtNumb;
import com.example.student_pl.myapplication.first.lab.arithmetic.Szescian;

public class InputNumber extends AppCompatActivity {

    public static final String  IMIE = "package com.example.student_pl.myapplication;";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_number);
    }

    public void sqrt(View view){
        Intent intent = new Intent(this, SqrtNumb.class);

        EditText editText =(EditText) findViewById(R.id.NumberEditText);
        String number = editText.getText().toString();
        intent.putExtra(IMIE, number);

        startActivity(intent);
    }

    public void szescian(View view){
        Intent intent = new Intent(this, Szescian.class);

        EditText editText =(EditText) findViewById(R.id.NumberEditText);
        String number = editText.getText().toString();
        intent.putExtra(IMIE, number);

        startActivity(intent);
    }
}
