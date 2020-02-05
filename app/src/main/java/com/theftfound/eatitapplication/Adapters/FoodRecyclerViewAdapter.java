package com.theftfound.eatitapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.theftfound.eatitapplication.Model.Category;
import com.theftfound.eatitapplication.Model.Food;
import com.theftfound.eatitapplication.R;

import java.util.List;

public class FoodRecyclerViewAdapter extends RecyclerView.Adapter<FoodRecyclerViewAdapter.ViewHolder> {

    Context context;
    List<Food> foodList;

    public FoodRecyclerViewAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textManuName;
        public ImageView imageView;

        public ViewHolder(View view) {

            super(view);

            textManuName = itemView.findViewById(R.id.food_name);
            imageView = itemView.findViewById(R.id.food_image);

        }
    }

    @NonNull
    @Override
    public FoodRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view2 = LayoutInflater.from(context).inflate(R.layout.food_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view2);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodRecyclerViewAdapter.ViewHolder holder, int position) {
        final Food food = foodList.get(position);
        holder.textManuName.setText(food.getName());
        Picasso.get().load(food.getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
