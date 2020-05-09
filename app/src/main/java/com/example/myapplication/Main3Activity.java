package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Main3Activity extends AppCompatActivity {

    ListView lv1;

    String[] names1 = new String[]{"Abs Workout", "Upper Body Workout", "Lower Body Workout", "Full Body Workout"};

        Integer[] img1={
        R.drawable.bg1,
        R.drawable.bg1,
        R.drawable.bg1,
        R.drawable.bg1,
        };
    //String[] buttons1 ={"Let's Start","Let's Start","Let's Start","Let's Start"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        lv1= (ListView)findViewById(R.id.ListView1);

        MyAdapter adapter = new MyAdapter(this, names1, img1);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {   //Intent to be added, Toast for testing
                    Toast.makeText(getApplicationContext(), "Abs workout", Toast.LENGTH_SHORT).show();
                }
                if (position == 1)
                {//Intent to be added, Toast for testing
                   Toast t= Toast.makeText(getApplicationContext(), "Upper Body workout", Toast.LENGTH_LONG);
                           t.show();
                }
                if (position == 2)
                {//Intent to be added, Toast for testing
                    Toast.makeText(getApplicationContext(), "Lower Body workout", Toast.LENGTH_LONG).show();
                }
                if (position == 3)
                {//Intent to be added, Toast for testing
                    Toast.makeText(getApplicationContext(), "Full Body workout", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String Names1[];
        //String Buttons1[];
        Integer Img1[];

        MyAdapter(Context c, String names[], Integer imgs[])
        {
            super(c, R.layout.male_listview, names);
            this.context = c;
            this.Names1 = names;
           // this.Buttons1 = buttons;
            this.Img1 = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater)getApplication().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View male_listview =  layoutInflater.inflate(R.layout.male_listview, parent, false);
            ImageView images = male_listview.findViewById(R.id.image1);
            TextView texts = male_listview.findViewById(R.id.text6);
            //Button myButtons = male_listview.findViewById(R.id.button2);

            images.setImageResource(Img1[position]);
            texts.setText(Names1[position]);
            //myButtons.setText(buttons1[position]);

            return male_listview;
        }
    }
}
