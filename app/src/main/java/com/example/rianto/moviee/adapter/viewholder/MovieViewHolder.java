package com.example.rianto.moviee.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.rianto.moviee.R;

/**
 * Created by rianto on 1/30/2018.
 */

public class MovieViewHolder extends RecyclerView.ViewHolder {

    public ImageView gambar_movie;
    public LinearLayout layout_parent;


    public MovieViewHolder(View itemView) {
        super(itemView);

        gambar_movie = (ImageView) itemView.findViewById(R.id.gambar_movie);
        layout_parent = (LinearLayout) itemView.findViewById(R.id.layout_parent);
    }

    public LinearLayout getItem() {
        return layout_parent;
    }
}

