package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<item_model> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        itemList = new ArrayList<>();

        itemList.add(new item_model(R.drawable.action, "Action","1995"));
        itemList.add(new item_model(R.drawable.avatar, "Avatar","1996"));
        itemList.add(new item_model(R.drawable.avengers, "Avengers","1990"));
        itemList.add(new item_model(R.drawable.wish, "Wish","1984"));
        itemList.add(new item_model(R.drawable.bloodydaddy, "Bloody Daddy","1996"));
        itemList.add(new item_model(R.drawable.riverwild, "RiverWild","1992"));
        itemList.add(new item_model(R.drawable.uncharted, "Uncharted","1990"));
        itemList.add(new item_model(R.drawable.muzzle, "Muzzle","1998"));

        MovieAdapter adapter = new MovieAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }


}