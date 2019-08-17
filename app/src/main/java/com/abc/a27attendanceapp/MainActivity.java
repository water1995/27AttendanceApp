package com.abc.a27attendanceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.user_type);

        String[] type_array = new String[]{
                "SELECT",
                "STUDENT",
                "PROFESSOR"
        };

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,R.layout.spinner,type_array);
        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner);
        spinner.setAdapter(spinnerArrayAdapter);
    }
}
