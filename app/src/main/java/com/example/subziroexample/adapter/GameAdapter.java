package com.example.subziroexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.subziroexample.R;

public class GameAdapter extends RecyclerView.Adapter<GameViewHolder> {
    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View gameItemViewLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_items, parent, false);
        return new GameViewHolder(gameItemViewLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
