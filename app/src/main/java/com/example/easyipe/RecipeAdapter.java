package com.example.easyipe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.ViewHolder> {

    private List<Recipe> recipeList;
    private Context context;

    public RecipeAdapter(List<Recipe> recipeList, Context context){
        this.recipeList = recipeList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recipe, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Recipe recipe = recipeList.get(position);
        holder.recipeName.setText(recipe.getName());
        holder.recipeImage.setImageResource(recipe.getImageResId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, RecipeDetailActivity.class);
            intent.putExtra("recipe", recipe);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView recipeImage;
        TextView recipeName;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            recipeImage = itemView.findViewById(R.id.recipeImage);
            recipeName = itemView.findViewById(R.id.recipeName);
        }
    }
}
