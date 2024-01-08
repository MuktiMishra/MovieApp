package com.example.movieapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{
    //Guy who is a coolie
    public ImageView imageview;
    public TextView  movie, date;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageview = itemView.findViewById(R.id.imageView);
        movie = itemView.findViewById(R.id.movie);
        date = itemView.findViewById(R.id.date);
    }
}
