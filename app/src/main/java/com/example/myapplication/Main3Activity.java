package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    ListView lv1;

    String[] names1 = new String[]{"Abs Workout", "Upper Body Workout", "Lower Body Workout", "Full Body Workout"};

    Integer[] img1={
            R.drawable.bg1,
            R.drawable.bg1,
            R.drawable.bg1,
            R.drawable.bg1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lv1 = findViewById(R.id.ListView1);

        CustomListAdapter adapter = new CustomListAdapter(this, names1, img1);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0)
        {   //Intent to be added, Toast for testing
           // Toast.makeText(getApplicationContext(), "Abs workout", Toast.LENGTH_LONG).show();
            Intent i = new Intent(Main3Activity.this, MaleWorkoutSelection.class);
            startActivity(i);
           // Bundle b = new Bundle();

        }
        else if(position == 1)
        {//Intent to be added, Toast for testing
            Toast.makeText(getApplicationContext(), "Upper Body workout", Toast.LENGTH_LONG).show();
        }
        else if(position == 2)
        {//Intent to be added, Toast for testing
            Toast.makeText(getApplicationContext(), "Lower Body workout", Toast.LENGTH_LONG).show();
        }
        else if(position == 3)
        {//Intent to be added, Toast for testing
            Toast.makeText(getApplicationContext(), "Full Body workout", Toast.LENGTH_LONG).show();
        }
    }
}