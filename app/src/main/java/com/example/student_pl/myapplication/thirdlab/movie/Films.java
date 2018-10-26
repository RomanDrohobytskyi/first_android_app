package com.example.student_pl.myapplication.thirdlab.movie;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.student_pl.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Films extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films);

        listView = findViewById(R.id.filmsView);

        final ArrayList films = new ArrayList();
        films.add("Iron Man (2008)");
        films.add("The Incredible Hulk (2008)");
        films.add("Iron Man 2 (2010)");
        films.add("Thor (2011)");
        films.add("Captain America: The First Avenger (2011)");
        films.add("Marvel's The Avengers (2012)");
        films.add("Iron Man 3 (2013)");
        films.add("Thor: The Dark World (2013)");
        films.add("Captain America: The Winter Soldier (2014)");
        films.add("Guardians of the Galaxy (2014)");
        films.add("Avengers: Age of Ultron (2015)");

        arrayAdapter = new ArrayAdapter<>(this, R.layout.element, films);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Films.this, "Copied: " + films.get(position),
                        Toast.LENGTH_SHORT).show();
                ClipboardManager clipboardManager = (ClipboardManager)
                        getSystemService(CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Result", (CharSequence)
                        films.get(position));
                clipboardManager.setPrimaryClip(clipData);
            }
        });
    }

}
