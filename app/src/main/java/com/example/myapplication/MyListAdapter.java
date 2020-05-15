package com.example.myapplication;

import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.nio.file.attribute.PosixFileAttributes;


public class MyListAdapter extends RecyclerView.Adapter {

    private MyListData[] listData;
    TextView txt1, txt2;
    ImageView img1;

    public MyListAdapter(MyListData[] listData) {
        this.listData = listData;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        RecyclerView.ViewHolder viewHolder;
        viewHolder = new RecyclerView.ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        final MyListData myListData = listData[position];
        holder.txt1.setText(listData[position].getMainText());
        holder.txt2.setText(listData[position].getDescription());
        holder.img1.setText(listData[position].getImgid());
        //
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img1;
        public TextView txt1;
        public TextView txt2;
        public ViewHolder(View itemView) {
            super(itemView);
            this.txt1 = (TextView) itemView.findViewById(R.id.txt1);
            this.txt2 = (TextView) itemView.findViewById(R.id.txt2);
            this.img1 = (ImageView) itemView.findViewById(R.id.img1);

        }
    }

}
