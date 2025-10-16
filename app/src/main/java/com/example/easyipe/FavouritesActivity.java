package com.example.easyipe;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavouritesActivity extends AppCompatActivity {

    private RecyclerView recyclerFavourites;
    private TextView noFavMessage;
    private Button backFavButton;
    private List<Recipe> allRecipes;
    private List<Recipe> favRecipes;
    private RecipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        recyclerFavourites = findViewById(R.id.recyclerFavourites);
        noFavMessage = findViewById(R.id.noFavMessage);
        backFavButton = findViewById(R.id.backFavButton);

        // Load all recipes (same as in MainActivity)
        allRecipes = new ArrayList<>();
        allRecipes.add(new Recipe("Tofu Tikka","Indian Veg","Tofu, Greek yogurt, spices...","Step 1: Bake tofu...", R.drawable.tofu_tikka));
        allRecipes.add(new Recipe("Potato Frittata","Indian Veg","Potatoes, leek, chickpea flour...","Step 1: Chop potatoes...", R.drawable.potato_frittata));
        allRecipes.add(new Recipe("Bruschetta","Italian","Bread, tomatoes, basil...","Step 1: Slice bread...", R.drawable.bruschetta));
        allRecipes.add(new Recipe("Veg Risotto","Italian","Olive oil, butter, onion...","Step 1: Saute onion...", R.drawable.mushroom_risotto));
        allRecipes.add(new Recipe("Masala Chai","Kettle Foods","Tea leaves, cardamom, milk...","Step 1: Boil water...", R.drawable.masala_chai));
        allRecipes.add(new Recipe("Boiled Eggs","Kettle Foods","Eggs, water, salt","Step 1: Boil eggs...", R.drawable.boiled_eggs));
        allRecipes.add(new Recipe("Tomato Soup","Kettle Foods","Instant soup mix, water","Step 1: Mix and heat...", R.drawable.tomato_soup));
        allRecipes.add(new Recipe("Stuffed Cookies","Sweets","Nutella, flour, butter...","Step 1: Make dough...", R.drawable.nutella_cookies));
        allRecipes.add(new Recipe("Semiya Kheer","Sweets","Milk, seviyan, MILKMAID...","Step 1: Boil milk...", R.drawable.semiya_kheer));

        loadFavourites();
        setupRecycler();

        backFavButton.setOnClickListener(v -> finish());
    }

    private void loadFavourites(){
        favRecipes = new ArrayList<>();
        SharedPreferences prefs = getSharedPreferences("favourites", MODE_PRIVATE);
        for(Recipe recipe : allRecipes){
            if(prefs.getBoolean(recipe.getName(), false)){
                favRecipes.add(recipe);
            }
        }

        if(favRecipes.isEmpty()){
            noFavMessage.setVisibility(View.VISIBLE);
            recyclerFavourites.setVisibility(View.GONE);
        } else {
            noFavMessage.setVisibility(View.GONE);
            recyclerFavourites.setVisibility(View.VISIBLE);
        }
    }

    private void setupRecycler(){
        recyclerFavourites.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecipeAdapter(favRecipes, this);
        recyclerFavourites.setAdapter(adapter);
    }
}
