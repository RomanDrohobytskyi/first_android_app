package com.example.student_pl.myapplication.thirdlab.movie;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.student_pl.myapplication.R;

import java.util.ArrayList;

public class Series extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        final ArrayList series = new ArrayList();
        series.add("Marvel's Agents of S.H.I.E.L.D. (2013–)");
        series.add("Marvel's Agent Carter (2015–16)");
        series.add("Marvel's Inhumans (2017)");
        series.add("Marvel's Daredevil (2015–)");
        series.add("CMarvel's Jessica Jones (2015–)");
        series.add("Marvel's Luke Cage (2016–18)");

        listView = findViewById(R.id.seriesView);

        arrayAdapter = new ArrayAdapter<>(this, R.layout.element, series);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Series.this, "Copied: " + series.get(position),
                        Toast.LENGTH_SHORT).show();
                ClipboardManager clipboardManager = (ClipboardManager)
                        getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Result", (CharSequence)
                        series.get(position));
                clipboardManager.setPrimaryClip(clipData);
            }
        });

        arrayAdapter = new ArrayAdapter<>(this, R.layout.element, series);
        listView.setAdapter(arrayAdapter);
    }
}
