package com.example.subziroexample.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.subziroexample.R;

public class GameViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView name, genre, rate;

    public GameViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image_card);
        name = itemView.findViewById(R.id.name);
        genre = itemView.findViewById(R.id.genre);
        rate = itemView.findViewById(R.id.star);
    }
}
