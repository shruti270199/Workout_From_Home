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
    int gender;

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

        Intent intent = getIntent();
        gender = intent.getIntExtra("gender",1);
        if(gender==1)
            Toast.makeText(getApplicationContext(), "male", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(), "female", Toast.LENGTH_SHORT).show();

        CustomListAdapter adapter = new CustomListAdapter(this, names1, img1);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0) {
            Intent i = new Intent(Main3Activity.this, MaleWorkoutSelection.class);
            i.putExtra("gender", gender);
            i.putExtra("exercise type", "Abs workout");
            startActivity(i);
            Toast.makeText(getApplicationContext(), "Abs workout", Toast.LENGTH_SHORT).show();
        }
        else if(position == 1)
        {
            Intent i = new Intent(Main3Activity.this, MaleWorkoutSelection.class);
            i.putExtra("gender",gender);
            i.putExtra("exercise type","Upper Body workout");
            startActivity(i);
            //Toast.makeText(getApplicationContext(), "Upper Body workout", Toast.LENGTH_LONG).show();
        }
        else if(position == 2)
        {
            Intent i = new Intent(Main3Activity.this, MaleWorkoutSelection.class);
            i.putExtra("gender",gender);
            i.putExtra("exercise type","Lower Body workout");
            startActivity(i);
            //Toast.makeText(getApplicationContext(), "Lower Body workout", Toast.LENGTH_LONG).show();
        }
        else if(position == 3)
        {
            Intent i = new Intent(Main3Activity.this, MaleWorkoutSelection.class);
            i.putExtra("gender",gender);
            i.putExtra("exercise type","Full Body workout");
            startActivity(i);
            //Toast.makeText(getApplicationContext(), "Full Body workout", Toast.LENGTH_LONG).show();
        }
    }
}