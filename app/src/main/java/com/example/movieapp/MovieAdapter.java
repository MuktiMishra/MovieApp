package com.example.movieapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<item_model> itemList;

    public MovieAdapter(Context context, List<item_model> itemList){
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        item_model item = itemList.get(position);
        holder.movie.setText(item.getMovie());
        holder.date.setText(item.getDate());
        holder.imageview.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
