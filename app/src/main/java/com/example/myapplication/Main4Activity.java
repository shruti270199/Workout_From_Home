package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


public class Main4Activity extends AppCompatActivity {
    GridView gridview;

    TextView nameText;
    TextView descriptionText;
    ImageView gridImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        gridview = findViewById(R.id.grid_view);

        CustomAdapter customAdapter = new CustomAdapter();
        gridview.setAdapter(customAdapter);
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.grid_row_data, null);

            nameText = view.findViewById(R.id.grid_text1);
            descriptionText = view.findViewById(R.id.grid_text2);
            gridImages = view.findViewById(R.id.grid_img);

            //setText and setImageResource
            return view;

        }
    }
}