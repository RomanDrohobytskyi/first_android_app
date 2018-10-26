package com.example.student_pl.myapplication.secondlab.mylist;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.student_pl.myapplication.R;
import com.example.student_pl.myapplication.thirdlab.ThirdLabMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_list);

        listView = findViewById(R.id.randomNumbsView);

        ArrayList randomNumbs = getRandomList();

        arrayAdapter = new ArrayAdapter<>(this, R.layout.element, randomNumbs);
        listView.setAdapter(arrayAdapter);

    }

    public ArrayList getRandomList(){
        Random random = new Random();
        ArrayList randomNumbs = new ArrayList();
        for (int i = 0; i < 30; i++) {
            randomNumbs.add(random.nextInt(10001));
        }
        return randomNumbs;
    }
}
