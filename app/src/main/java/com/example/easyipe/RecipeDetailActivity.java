package com.example.easyipe;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetailActivity extends AppCompatActivity {

    private TextView recipeName, recipeCategory, recipeIngredients, recipeInstructions, overallRating;
    private ImageView recipeImage;
    private RatingBar ratingBar;
    private Button addToFavourites, backButton, submitButton;
    private Recipe recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        // Initialize UI components
        recipeName = findViewById(R.id.recipeName);
        recipeCategory = findViewById(R.id.recipeCategory);
        recipeIngredients = findViewById(R.id.recipeIngredients);
        recipeInstructions = findViewById(R.id.recipeInstructions);
        recipeImage = findViewById(R.id.recipeImage);
        ratingBar = findViewById(R.id.ratingBar);
        overallRating = findViewById(R.id.overallRating);
        addToFavourites = findViewById(R.id.addToFavourites);
        backButton = findViewById(R.id.backButton);
        submitButton = findViewById(R.id.submitButton);

        // Get recipe data from intent
        recipe = (Recipe) getIntent().getSerializableExtra("recipe");
        if (recipe != null) {
            recipeName.setText(recipe.getName());
            recipeCategory.setText("Category: " + recipe.getSubCategory());
            recipeIngredients.setText(recipe.getIngredients());
            recipeInstructions.setText(recipe.getInstructions());

            // Load recipe image dynamically (make sure your Recipe class has getImageResId())
            recipeImage.setImageResource(recipe.getImageResId());
        }

        // Add to Favourites button
        addToFavourites.setOnClickListener(v -> {
            saveToFavourites(recipe.getName());
            Toast.makeText(this, "Recipe added to Favourites!", Toast.LENGTH_SHORT).show();
        });

        // RatingBar listener
        ratingBar.setOnRatingBarChangeListener((bar, rating, fromUser) ->
                overallRating.setText(rating + " stars (1)"));

        // Submit button click
        submitButton.setOnClickListener(v ->
                Toast.makeText(this, "Rating submitted!", Toast.LENGTH_SHORT).show());

        // Back button
        backButton.setOnClickListener(v -> finish());
    }

    private void saveToFavourites(String recipeName) {
        SharedPreferences prefs = getSharedPreferences("favourites", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(recipeName, true);
        editor.apply();
    }
}
