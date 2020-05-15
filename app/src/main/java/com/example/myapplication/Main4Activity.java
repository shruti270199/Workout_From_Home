package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        MyListData[] myListData = new MyListData[] {
                new MyListData("Text1","This is description 1", android.R.drawable.ic_input_add),
                new MyListData("Text2","This is description 2", android.R.drawable.ic_btn_speak_now),
                new MyListData("Text3","This is description 3", android.R.drawable.ic_input_delete),
                new MyListData("Text1","This is description 1", android.R.drawable.ic_input_add),
                new MyListData("Text2","This is description 2", android.R.drawable.ic_btn_speak_now),
                new MyListData("Text3","This is description 3", android.R.drawable.ic_input_delete),
                new MyListData("Text1","This is description 1", android.R.drawable.ic_input_add),
                new MyListData("Text2","This is description 2", android.R.drawable.ic_btn_speak_now),
                new MyListData("Text3","This is description 3", android.R.drawable.ic_input_delete),
                new MyListData("Text1","This is description 1", android.R.drawable.ic_input_add),
                new MyListData("Text2","This is description 2", android.R.drawable.ic_btn_speak_now),
                new MyListData("Text3","This is description 3", android.R.drawable.ic_input_delete),
        };


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}