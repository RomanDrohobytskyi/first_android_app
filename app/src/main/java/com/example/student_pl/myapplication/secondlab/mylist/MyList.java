package com.example.student_pl.myapplication.secondlab.mylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.student_pl.myapplication.R;
import com.example.student_pl.myapplication.thirdlab.ThirdLabMain;

import java.util.ArrayList;

public class MyList extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        listView = findViewById(R.id.listView);

        ArrayList carNames = new ArrayList();
        carNames.add("Audi");
        carNames.add("Mercedes");
        carNames.add("BMW");
        carNames.add("Opel");
        carNames.add("Audi");
        carNames.add("Mercedes");
        carNames.add("BMW");
        carNames.add("Opel");
        carNames.add("Audi");
        carNames.add("Mercedes");
        carNames.add("BMW");
        carNames.add("Opel");
        carNames.add("Audi");
        carNames.add("Mercedes");
        carNames.add("BMW");
        carNames.add("Opel");
        carNames.add("Audi");
        carNames.add("Mercedes");
        carNames.add("BMW");
        carNames.add("Opel");

        arrayAdapter = new ArrayAdapter<>(this, R.layout.element, carNames);
        listView.setAdapter(arrayAdapter);
    }
}
