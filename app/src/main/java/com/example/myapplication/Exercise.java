package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionSet;
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
        timer = findViewById(R.id.timer_text);


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
}
