package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
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

    TextView description , timer_text;
    ImageView image;
    Button start_timer,reset_timer;

    CountDownTimer t;

        Integer[] male_abs ={
                R.drawable.abs_easy_hindupushup,
                R.drawable.abs_easy_hipraises,
                R.drawable.abs_easy_inchworm,
                R.drawable.abs_easy_plank,
                R.drawable.abs_medium_alternate_heal_touches,
                R.drawable.abs_medium_bench_leg_pull_in,
                R.drawable.abs_medium_jackknife_situps,
                R.drawable.abs_medium_sideplank,
                R.drawable.abs_hard_dbl_side_jack,
                R.drawable.abs_hard_dumbbell_side_bend,
                R.drawable.abs_hard_dumbell_chop,
                R.drawable.abs_hard_russian_twist,
        };

        Integer[] male_up = {
                R.drawable.up_easy_bicep_curl,
                R.drawable.up_easy_tricep,
                R.drawable.up_easy_triceps_extension,
                R.drawable.up_medium_chinups,
                R.drawable.up_medium_close_grip_pull_up,
                R.drawable.up_hard_hammer_grip_pull_up_n,
                R.drawable.up_hard_wide_grip_pull_ups,
        };
    Integer[] male_lb ={
            R.drawable.fb_easy_bodyweight_squats,
            R.drawable.fb_easy_knee_push_ups,
            R.drawable.fb_easy_planks_n,
            R.drawable.fb_easy_jumping_jacks,
            R.drawable.fb_medium_crunches,
            R.drawable.fb_medium_donkey_kicks,
            R.drawable.fb_medium_mountain_climbers,
            R.drawable.fb_hard_burpees,
            R.drawable.fb_hard_clap_push_ups,
            R.drawable.fb_hard_split_alternating_squat_jumps,


    };

    Integer[] male_fb ={
            R.drawable.lb_easy_calf_raises,
            R.drawable.lb_easy_wall_sit,
            R.drawable.lb_easy_pilates,
            R.drawable.lb_medium_jump_squats,
            R.drawable.lb_medium_mountain_climbers,
            R.drawable.lb_medium_walking_lunge,
            R.drawable.lb_hard_dumbell_squats,
            R.drawable.lb_hard_swiss_ball_leg_lifts,
            R.drawable.lb_hard_lunge_twist,
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

        timer_text = findViewById(R.id.timer_txt);
        start_timer = findViewById(R.id.timer_start);
        reset_timer = findViewById(R.id.timer_reset);
        start_timer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                long maxTimeInMilliseconds = 30000;// in your case
                startTimer(maxTimeInMilliseconds, 1000);
            }
        });
        reset_timer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                t.cancel();
                timer_text.setText("00:00");
                //long maxTimeInMilliseconds = 30000;// in your case
                //startTimer(maxTimeInMilliseconds, 1000);
            }
        });



        if(gender==1)
        {
            if(exercise_type.equals("Abs workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Male , Abs workout "+level, Toast.LENGTH_SHORT).show();
             //   image.setImageResource(img1[0]);
            }
            else if(exercise_type.equals("Upper Body workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Male , Upper Body workout "+level, Toast.LENGTH_SHORT).show();
              //  image.setImageResource(img1[0]);
            }
            else if(exercise_type.equals("Lower Body workout"))
            {
                Toast.makeText(getApplicationContext(), "Gender: Male , Lower Body workout "+level, Toast.LENGTH_SHORT).show();
              //  image.setImageResource(img1[0]);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Gender: Male , Full Body workout "+level, Toast.LENGTH_SHORT).show();
              //  image.setImageResource(img1[0]);
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

    public void startTimer(final long finish, long tick) {
        //CountDownTimer t;
        t = new CountDownTimer(finish, tick) {

            public void onTick(long millisUntilFinished) {
                long remainedSecs = millisUntilFinished / 1000;
                timer_text.setText("" + (remainedSecs / 60) + ":" + (remainedSecs % 60));// manage it accordign to you
            }

            public void onFinish() {
                timer_text.setText("00:00");
                Toast.makeText(Exercise.this, "Finish", Toast.LENGTH_SHORT).show();
                cancel();
            }
        }.start();
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
