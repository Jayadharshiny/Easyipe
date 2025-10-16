package com.example.easyipe;

import java.io.Serializable;

public class Recipe implements Serializable {
    private String name;
    private String category;
    private String ingredients;
    private String instructions;
    private String subCategory; // eg. Indian Veg, Italian
    private int imageResId;

    public Recipe(String name, String subCategory, String ingredients, String instructions, int imageResId) {
        this.name = name;
        this.subCategory = subCategory;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.imageResId = imageResId;
    }

    public String getName() { return name; }
    public String getSubCategory() { return subCategory; }
    public String getIngredients() { return ingredients; }
    public String getInstructions() { return instructions; }
    public int getImageResId() { return imageResId; }
}

