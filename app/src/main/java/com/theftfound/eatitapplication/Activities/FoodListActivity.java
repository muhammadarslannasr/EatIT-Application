package com.theftfound.eatitapplication.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theftfound.eatitapplication.Adapters.FoodRecyclerViewAdapter;
import com.theftfound.eatitapplication.Adapters.HomeRecyclerViewAdapter;
import com.theftfound.eatitapplication.Model.Category;
import com.theftfound.eatitapplication.Model.Food;
import com.theftfound.eatitapplication.R;

import java.util.ArrayList;
import java.util.List;

public class FoodListActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference foods;
    RecyclerView recycler_food;
    RecyclerView.LayoutManager layoutManager;
    private FoodRecyclerViewAdapter foodRecyclerViewAdapter;
    private List<Food> foodList;
    private String CategoryID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        // Firebase
        database = FirebaseDatabase.getInstance();
        foods = database.getReference("Foods");


        foodList = new ArrayList<>();

//        recycler_food = findViewById(R.id.recycler_food);
//        recycler_food.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(FoodListActivity.this);
//        recycler_food.setLayoutManager(layoutManager);

        // Get Intent here
        if (getIntent() != null)
            CategoryID = getIntent().getStringExtra("CategoryId");
        if (!CategoryID.isEmpty() && CategoryID != null){
            Log.d("ID",CategoryID);
            //loadListFood(CategoryID);
        }
    }

//    private void loadListFood(String categoryID) {
//        foods.orderByChild("MenuID").equalTo(categoryID).addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//                Food food = dataSnapshot.getValue(Food.class);
//                foodList.add(food);
//                foodRecyclerViewAdapter = new FoodRecyclerViewAdapter(FoodListActivity.this, foodList);
//                recycler_food.setAdapter(foodRecyclerViewAdapter);
//                foodRecyclerViewAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//    }
}
