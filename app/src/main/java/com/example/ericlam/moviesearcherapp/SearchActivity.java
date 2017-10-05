package com.example.ericlam.moviesearcherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * Created by ChrisDubeau on 2017-10-05.
 */
public class SearchActivity extends AppCompatActivity {
    public String[] Genre = new String[]{"Horror","Comedy","Western"};
    public String[] Alphabet = new String[]{"A","B","C"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);
        Spinner spinner = (Spinner) findViewById(R.id.genreDrop);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,Genre);
        spinner.setAdapter(adapter);
    }
}
