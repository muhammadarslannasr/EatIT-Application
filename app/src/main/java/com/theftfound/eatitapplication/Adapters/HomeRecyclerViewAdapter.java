package com.theftfound.eatitapplication.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.theftfound.eatitapplication.Activities.FoodListActivity;
import com.theftfound.eatitapplication.Model.Category;
import com.theftfound.eatitapplication.R;

import java.util.List;

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeRecyclerViewAdapter.ViewHolder> {

    Context context;
    List<Category> categoryList;

    public HomeRecyclerViewAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textManuName;
        public ImageView imageView;

        public ViewHolder(View view) {

            super(view);

            textManuName = itemView.findViewById(R.id.menu_name);
            imageView = itemView.findViewById(R.id.menu_image);
        }
    }

    @NonNull
    @Override
    public HomeRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view2 = LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view2);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRecyclerViewAdapter.ViewHolder holder, int position) {
        final Category category = categoryList.get(position);
        holder.textManuName.setText(category.getName());
        Picasso.get().load(category.getImage()).into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 //Get Category ID and send it to new Activity
                Intent intent = new Intent(context, FoodListActivity.class);
                intent.putExtra("CategoryId",category.getCategoryID());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
