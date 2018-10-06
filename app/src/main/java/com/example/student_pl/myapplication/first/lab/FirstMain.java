package com.example.student_pl.myapplication.first.lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.student_pl.myapplication.R;
import com.example.student_pl.myapplication.constants.Constants;

public class FirstMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_main);
    }

    public void NewActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        EditText editText =(EditText) findViewById(R.id.nameEdit);
        String massage = editText.getText().toString();
        intent.putExtra(Constants.FIRST_MAIN, massage);

        startActivity(intent);
    }
}
