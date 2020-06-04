package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Exercise extends AppCompatActivity {
    int gender,level,exercise_no;
    String exercise_type;

    TextView description , timer;
    ImageView image;

    Integer[] img1={
            R.drawable.bg1,
            R.drawable.bg1,
            R.drawable.bg1,
            R.drawable.bg1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        image = findViewById(R.id.ex_img);
        description = findViewById(R.id.description);
        //timer = findViewById(R.id.timer_text);


        Intent intent = getIntent();
        gender = intent.getIntExtra("gender",1);
        exercise_type = intent.getStringExtra("exercise type");
        level = intent.getIntExtra("level",1);
        exercise_no = intent.getIntExtra("ex_num",1);

        if(gender==1)
        {
            if(exercise_type.equals("Abs workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Male , Abs workout "+level, Toast.LENGTH_SHORT).show();
                image.setImageResource(img1[0]);
            }
            else if(exercise_type.equals("Upper Body workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Male , Upper Body workout "+level, Toast.LENGTH_SHORT).show();
                image.setImageResource(img1[0]);
            }
            else if(exercise_type.equals("Lower Body workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Male , Lower Body workout "+level, Toast.LENGTH_SHORT).show();
                image.setImageResource(img1[0]);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Gender: Male , Full Body workout "+level, Toast.LENGTH_SHORT).show();
                image.setImageResource(img1[0]);
            }
        }
        else
        {
            if(exercise_type.equals("Abs workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Female , Abs workout "+level, Toast.LENGTH_SHORT).show();
                //image.setImageResource(img1[0]);
            }
            else if(exercise_type.equals("Upper Body workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Female , Upper Body workout "+level, Toast.LENGTH_SHORT).show();
                //image.setImageResource(img1[0]);
            }
            else if(exercise_type.equals("Lower Body workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Female , Lower Body workout "+level, Toast.LENGTH_SHORT).show();
                //image.setImageResource(img1[0]);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Gender: Female , Full Body workout "+level, Toast.LENGTH_SHORT).show();
                //image.setImageResource(img1[0]);
            }

        }
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.bmi_calc:
                Intent i0 = new Intent(Exercise.this, BMI.class);
                startActivity(i0);
                break;
            case R.id.feedback:
                Intent i1 = new Intent(Exercise.this, Feedback.class);
                startActivity(i1);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
