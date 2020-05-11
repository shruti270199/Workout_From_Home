package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MaleWorkoutSelection extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_workout_selection);

        Spinner spinner = findViewById(R.id.spinner_selection_male);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.male_selection_spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        switch (position){

            case 1:
                //Intent
                Toast.makeText(getApplicationContext(), "Beginer", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                //Intent
                Toast.makeText(getApplicationContext(), "Beginer", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                //Intent
                Toast.makeText(getApplicationContext(), "Beginer", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


        Toast.makeText(getApplicationContext(), "Please select", Toast.LENGTH_SHORT).show();
    }
}
