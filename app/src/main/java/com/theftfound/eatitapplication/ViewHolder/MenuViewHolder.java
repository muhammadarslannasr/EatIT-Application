package com.theftfound.eatitapplication.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.theftfound.eatitapplication.Interfaces.OnItemClickListener;
import com.theftfound.eatitapplication.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textManuName;
    public ImageView imageView;
    private OnItemClickListener onItemClickListener;

    public MenuViewHolder(View itemView){
        super(itemView);

        textManuName = itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public void onClick(View v) {
        onItemClickListener.onClick(v,getAdapterPosition(),false);
    }
}
