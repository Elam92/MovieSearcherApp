package com.example.ericlam.moviesearcherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;


/**
 * Created by ChrisDubeau on 2017-10-05.
 */
public class SearchActivity extends AppCompatActivity {
    public String[] genre = new String[]{"Horror","Comedy","Western"};
    public String[] year = new String[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);
        Spinner spinner = (Spinner) findViewById(R.id.genreDrop);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,genre);
        spinner.setAdapter(adapter);
        Spinner spinner2 = (Spinner) findViewById(R.id.yearDrop);
        for(int i = 1; i <= 10; i++){
            year[i-1] = Integer.toString(i);
        }
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,year);
        spinner2.setAdapter(adapter2);
        final Button advButton = (Button) findViewById(R.id.advSearch);
        advButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout advOption = (LinearLayout) findViewById(R.id.advOption);
                advOption.setVisibility(View.VISIBLE);
                advButton.setVisibility(View.GONE);
            }
        });
    }
}
