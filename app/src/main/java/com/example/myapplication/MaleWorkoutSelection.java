package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MaleWorkoutSelection extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    int gender;
    String exercise_type;
    TextView exercise_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_workout_selection);

        Spinner spinner = findViewById(R.id.spinner_selection_male);
        exercise_text = findViewById(R.id.text_exercise);

        Intent intent = getIntent();
        gender = intent.getIntExtra("gender",1);
        exercise_type = intent.getStringExtra("exercise type");
        exercise_text.setText(exercise_type);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.male_selection_spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0)
        {
           //String text = parent.getItemAtPosition(position).toString();
            Toast.makeText(parent.getContext(), "Select an option", Toast.LENGTH_SHORT).show();
        }
        else if(position == 1)
        {
            Intent i = new Intent(MaleWorkoutSelection.this,Exercise.class);
            i.putExtra("gender",gender);
            i.putExtra("exercise type",exercise_type);
            i.putExtra("level",1);
            startActivity(i);
        }
        else if(position == 2)
        {
            Intent i = new Intent(MaleWorkoutSelection.this,Exercise.class);
            i.putExtra("gender",gender);
            i.putExtra("exercise type",exercise_type);
            i.putExtra("level",2);
            startActivity(i);
        }
        else if(position == 3)
        {
            Intent i = new Intent(MaleWorkoutSelection.this,Exercise.class);
            i.putExtra("gender",gender);
            i.putExtra("exercise type",exercise_type);
            i.putExtra("level",3);
            startActivity(i);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}