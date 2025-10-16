package com.example.easyipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerIndian, recyclerItalian, recyclerKettle, recyclerSweets;
    private RecipeAdapter adapterIndian, adapterItalian, adapterKettle, adapterSweets;
    private List<Recipe> indianRecipes, italianRecipes, kettleRecipes, sweetsRecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button openFav = findViewById(R.id.openFavourites);
        openFav.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FavouritesActivity.class);
            startActivity(intent);
        });




        recyclerIndian = findViewById(R.id.recyclerIndian);
        recyclerItalian = findViewById(R.id.recyclerItalian);
        recyclerKettle = findViewById(R.id.recyclerKettle);
        recyclerSweets = findViewById(R.id.recyclerSweets);

        // Sample recipes with placeholders for images (replace with drawables)
        indianRecipes = new ArrayList<>();
        indianRecipes.add(new Recipe("Tofu Tikka","Indian Veg",
                "INGREDIENTS:\n\n 1).Tofu: Firm or extra-firm. Avoid silken or soft tofu, 2).Greek yogurt: Substitute with non-dairy Greek-style yogurt for a vegan version, 3).spices:Corainder,garam masala,cumin,turmeric, and red pepper flakes, 4).tomato puree: Substitute with tomato passata, 5).Heavy cream: Substitute with cashew cream or coconut milk, 6).Onion,Garlic and Ginger(Use fresh for best flavours), 7).sugar(Optional): Add 1-2 teaspoons.",
                "INSTRUCTIONS:\n\n Step 1: Bake the Tofu\n" +
                        "\n" +
                        "1. Preheat oven to 400°F (200°C) and line a baking sheet with parchment paper.\n" +
                        "\n" +

                        "2. In a large bowl, mix Greek yogurt, grated garlic, ginger, chili powder, cumin, garam masala, turmeric, coriander, oil, lemon juice, and salt.\n" +
                        "\n" +

                        "3. Pat the tofu dry, break into bite-sized pieces, and coat evenly with the marinade.\n" +
                        "\n" +

                        "4. Spread tofu on the baking sheet in a single layer.\n" +
                        "\n" +

                        "5. Bake for 30 minutes, until golden and slightly chewy (no flipping needed).\n" +
                        "\n" +

                        "6. Meanwhile, start preparing the masala sauce.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Make the Masala Sauce\n" +
                        "\n" +
                        "1. Heat oil in a large pot over medium heat.\n" +
                        "\n" +

                        "2. Add chopped onions and sauté for 5 minutes until translucent.\n" +
                        "\n" +

                        "3. Stir in grated garlic, ginger, red pepper flakes, coriander, cumin, and garam masala. Cook for 1 minute until fragrant.\n" +
                        "\n" +

                        "4. Add tomato puree, salt, and black pepper.\n" +
                        "\n" +

                        "5. Cook on medium-low for 5 minutes, then add water and heavy cream.\n" +
                        "\n" +

                        "6. Simmer for 10 minutes.\n" +
                        "\n" +
                        "\n" +
                        "Step 3: Add the Tofu\n" +
                        "\n" +
                        "1. Stir the baked tofu into the sauce.\n" +
                        "\n" +

                        "2. Add sugar if using, and simmer until the sauce reaches desired thickness.\n" +
                        "\n" +

                        "3. Adjust salt, sweetness, or acidity to taste.    ", R.drawable.tofu_tikka));
        indianRecipes.add(new Recipe("Potato Frittata","Indian Veg",
                "INGREDIENTS:\n\n 1).Potatoes(Yukon Gold, Red or Russet), 2).Olive oil: Use extra virgin oil for rich flavor in the veggies and batter, 3).leek:Choose a large one. It adds a delicious aroma and pairs beautifully with potatoes, 4).Spices: Turmeric and Cumin, 5).chickpea flour(Base of the batter), 6).Water(to mix with chickpea flour) 7).Salt and black pepper, 8).Kala Namak(Black salt-optional).",
                "INSTRUCTIONS:\n\n  Step 1: Chop Potatoes and Leek\n" +
                        "\n" +
                        "1. Peel and chop potatoes into ½-inch dice.\n" +
                        "\n" +

                        "2. Cut leek in half lengthwise, then slice thinly.\n" +
                        "\n" +

                        "3. Heat olive oil in a large skillet over medium heat.\n" +
                        "\n" +

                        "4. Add leek and potatoes; cook for 5 minutes.\n" +
                        "\n" +

                        "5. Add salt, pepper, turmeric, cumin, and a splash of water.\n" +
                        "\n" +

                        "6. Cover and cook on medium-low heat for 10 minutes, stirring occasionally, until potatoes are fork-tender.\n" +
                        "\n" +

                        "7. Add more water if needed. Taste and adjust seasoning.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Make the Frittata Batter\n" +
                        "\n" +
                        "1. In a mixing bowl, combine:\n" +

                        "Chickpea flour,\n" +

                        "Olive oil,\n" +

                        "Water,\n" +

                        "Salt & pepper,\n" +

                        "(Optional) Kala namak for eggy flavor\n" +
                        "\n" +

                        "2. Blend with an immersion blender for about 1 minute, until smooth.\n" +

                        "Alternatively, use a regular blender.\n" +
                        "\n" +

                        "3. Add the potato-leek mixture to the batter and stir gently to combine.\n" +
                        "\n" +
                        "\n" +
                        "Step 3: Bake the Frittata\n" +
                        "\n" +
                        "1. Preheat oven to 400°F (200°C).\n" +
                        "\n" +

                        "2. Line a 9-inch square baking pan with parchment paper.\n" +
                        "\n" +

                        "3. Pour in the batter and spread evenly with a spoon.\n" +
                        "\n" +

                        "4. Bake for 16 minutes, until the top is dry but the center remains soft and moist.\n" +
                        "\n" +

                        "5. Cool for 10 minutes, then cut into squares.      ", R.drawable.potato_frittata));

        italianRecipes = new ArrayList<>();
        italianRecipes.add(new Recipe("Bruschetta","Italian",
                "INGREDIENTS:\n\n 1).Country Bread: 1 loaf, sliced in half from the center, 2).tomatoes: 2 chopped, 3).basil leaves: Fresh and chopped, 4).garlic:Whole cloves(rubbing) and 1 grated clove(topping), 5).Olive oil(5 tablespoons), 6).Portobello mushrooms(4 sliced), 7). Red chilli: 1, deseeded and chopped, 8).Butter(1 tablespoon), salt and pepper.",
                "INSTRUCTIONS:\n\n Step 1: Prepare the Bread\n" +
                        "\n" +
                        "1. Slice the loaf of country bread into two halves.\n" +
                        "\n" +
                        "2. Cut a garlic clove and rub it on the surface of each bread slice.\n" +
                        "\n" +
                        "3. Drizzle lightly with olive oil.\n" +
                        "\n" +
                        "4. Roast in the oven for 5 minutes, until slightly crisp and golden.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Make the Mushroom and Garlic Topping\n" +
                        "\n" +
                        "1. In a pan, heat butter and olive oil together.\n" +
                        "\n" +

                        "2. Add grated garlic and a pinch of thyme (optional), and stir.\n" +
                        "\n" +
                        "3. Add sliced mushrooms and chopped red chillies; toss well.\n" +
                        "\n" +

                        "4. Season with salt and pepper.\n" +
                        "\n" +

                        "5. Cook until the mushrooms are tender and lightly browned.\n" +
                        "\n" +
                        "\n" +

                        "Step 3: Make the Tomato and Basil Topping\n" +
                        "\n" +
                        "1. In a bowl, combine chopped tomatoes, basil, salt, pepper, and a drizzle of olive oil.\n" +
                        "\n" +
                        "2. Mix well to blend the flavors.\n" +
                        "\n" +
                        "\n" +
                        "Step 4: Assemble the Bruschetta\n" +
                        "\n" +
                        "1. Place the toasted bread slices on a tray or serving platter.\n" +
                        "\n" +
                        "2. Pile up your choice of mushroom-garlic topping or tomato-basil topping (or both!).\n" +
                        "\n" +
                        "3. Serve immediately while warm and crisp.     ", R.drawable.bruschetta));
        italianRecipes.add(new Recipe("Veg Risotto","Italian",
                "INGREDIENTS:\n\n 1).Olive Oil: 1 tablespoon, 2).Butter: 25 grams, 3).Onion: 1, chopped, 4).Mushrooms: 200 grams, sliced 5).Arborio Rice: ½ cup 6).White Wine: ¼ cup (optional) 7).Hot Stock: 4 cups (chicken or vegetable) 8).Parmesan Cheese: ⅓ cup, grated 9).Parsley: 1 tablespoon, chopped 10).Extra Butter: 25 grams (to add just before serving) 11).Salt and Pepper: To taste",
                "INSTRUCTIONS:\n\n  Step 1: Sauté Vegetables\n" +
                        "\n" +
                        "1. Heat olive oil and butter in a pan.\n" +
                        "\n" +
                        "2. Add chopped onion and sliced mushrooms.\n" +
                        "\n" +
                        "3. Sauté until soft and fragrant.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Cook the Rice\n" +
                        "\n" +
                        "1. Stir in Arborio rice and cook until it becomes transparent.\n" +
                        "\n" +
                        "2. Add white wine if the rice looks dry and stir well.\n" +
                        "\n" +
                        "\n" +
                        "Step 3: Add Stock Gradually\n" +
                        "\n" +
                        "1. Add 1 ladle of hot stock, stir well, cover, and simmer gently until the rice absorbs the liquid.\n" +
                        "\n" +
                        "2. Repeat the process: add stock → stir → cover → simmer, until the rice is cooked (about 25 minutes).\n" +
                        "\n" +
                        "\n" +
                        "Step 4: Finish and Serve\n" +
                        "\n" +
                        "1. Taste and adjust salt.\n" +
                        "\n" +
                        "2. Remove from heat and stir in:\n" +
                        "\n" +
                        "Parmesan cheese\n" +
                        "Chopped parsley\n" +
                        "Extra butter (if using)\n" +
                        "Pepper to taste\n" +
                        "\n" +
                        "3. Serve warm immediately.    ", R.drawable.mushroom_risotto));

        kettleRecipes = new ArrayList<>();
        kettleRecipes.add(new Recipe("Masala Chai","Kettle Foods",
                "INGREDIENTS:\n\n 1).Tea leaves, 2).cardamom, 3).ginger, 4).milk, 5).sugar, 6).Water",
                "INSTRUCTIONS:\n\n  Step 1: Boil the Base\n" +
                        "\n" +
                        "1. Fill an electric kettle or small pot with water.\n" +
                        "\n" +
                        "2. Add tea leaves, crushed cardamom pods, ginger, and sugar.\n" +
                        "\n" +
                        "3. Bring the mixture to a boil.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Add Milk\n" +
                        "\n" +
                        "1. Once boiled, add milk.\n" +
                        "\n" +
                        "2. Let the mixture simmer for a few more minutes to blend flavors.\n" +
                        "\n" +
                        "\n" +
                        "Step 3: Serve\n" +
                        "\n" +
                        "1. Strain the tea into a cup.\n" +
                        "\n" +
                        "2. Enjoy the warmth and aroma of freshly brewed masala chai.   ", R.drawable.masala_chai));
        kettleRecipes.add(new Recipe("Boiled Eggs","Kettle Foods",
                "INGREDIENTS:\n\n 1).Eggs, 2).water, 3).salt and pepper.",
                "INSTRUCTIONS:\n\n Step 1: Boil the Eggs\n" +
                        "\n" +
                        "1. Fill a kettle or pot with water and place the eggs inside.\n" +
                        "\n" +
                        "2. Turn on the kettle and bring the water to a boil.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Cooking Time\n" +
                        "\n" +
                        "Hard-Boiled Eggs: Cook for 8–10 minutes.\n" +
                        "\n" +
                        "Soft-Boiled Eggs: Cook for 5–6 minutes.\n" +
                        "\n" +
                        "\n" +
                        "Step 3: Cool and Serve\n" +
                        "\n" +
                        "1. Transfer the eggs to cold water to cool.\n" +
                        "\n" +
                        "2. Peel the eggs.\n" +
                        "\n" +
                        "3. Serve with a sprinkle of salt and pepper.    ", R.drawable.boiled_eggs));
        kettleRecipes.add(new Recipe("Tomato Soup","Kettle Foods",
                "INGREDIENTS:\n\n 1).Instant tomato soup mix, 2).water, 3).croutons.",
                "INSTRUCTIONS:\n\n   Step 1: Prepare the Soup\n" +
                        "\n" +
                        "1. Pour the instant tomato soup mix into a kettle or small pot.\n" +
                        "\n" +
                        "2. Add the required amount of water as per the packet instructions.\n" +
                        "\n" +
                        "3. Stir well to dissolve the mix.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Heat\n" +
                        "\n" +
                        "1. Turn on the kettle and heat until the soup begins to simmer.\n" +
                        "\n" +
                        "\n" +
                        "Step 3: Serve\n" +
                        "\n" +
                        "1. Pour the hot soup into a bowl.\n" +
                        "\n" +
                        "2. Garnish with croutons if desired.\n" +
                        "\n" +
                        "3. Enjoy your comforting, warm tomato soup.     ", R.drawable.tomato_soup));

        sweetsRecipes = new ArrayList<>();
        sweetsRecipes.add(new Recipe("Stuffed Cookies","Sweets",
                "INGREDIENTS:\n\n 1).Nutella, 2).flour(All purpose), 3).butter(unsalted), 4).Brown sugar, 5)Large egg(Room temperature), 6).chocolate chips, 7).vanilla extract, 8).salt, 9).Baking soda, 10).Honey(1 teaspoon).",
                "INSTRUCTIONS:\n\n   Step 1: Prepare Cookie Dough\n" +
                        "\n" +
                        "1. Mix dry ingredients: Combine flour, baking soda, and salt in a bowl. Set aside.\n" +
                        "\n" +
                        "2. Melt butter: Microwave for ~30 seconds until barely melted, stir to finish melting.\n" +
                        "\n" +
                        "3. Mix dough: Add sugar, honey, vanilla, then the egg. Dough should look thick and caramel-like.\n" +
                        "\n" +
                        "4. Add flour: Mix in dry ingredients until fully combined.\n" +
                        "\n" +
                        "5. Chill dough: Cover with cling wrap and refrigerate for 1½ hours until firm enough to roll.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Prepare Frozen Nutella Discs\n" +
                        "\n" +
                        "1. Dollop 1 slightly heaped tablespoon of Nutella on a parchment-lined tray.\n" +
                        "\n" +
                        "2. Spread into ~8mm (⅓ inch) thick rounds.\n" +
                        "\n" +
                        "3. Freeze for 1 hour until firm enough to handle.\n" +
                        "\n" +
                        "\n" +
                        "Step 3: Shape Cookies\n" +
                        "\n" +
                        "1. Roll chilled dough into an 18 cm (7-inch) log.\n" +
                        "\n" +
                        "2. Cut into 10 equal pieces.\n" +
                        "\n" +
                        "3. Flatten each piece to ~5mm (0.2 inch) thick.\n" +
                        "\n" +
                        "4. Press a frozen Nutella disc in the center.\n" +
                        "\n" +
                        "5. Gather dough around the Nutella disc and seal completely.\n" +
                        "\n" +
                        "6. Flip cookie so gathered side is down and smooth side up.\n" +
                        "\n" +
                        "7. Shape into 1.5 cm thick rounds.\n" +
                        "\n" +
                        "8. Top with chocolate chips and press lightly.\n" +
                        "\n" +
                        "\n" +
                        "Step 4: Bake\n" +
                        "\n" +
                        "1. Preheat oven to 180°C / 350°F (160°C fan).\n" +
                        "\n" +
                        "2. Place cookies 8 cm (3 inches) apart on a tray.\n" +
                        "\n" +
                        "3. Bake for 12 minutes until edges are golden and surface is pale golden.\n" +
                        "\n" +
                        "4. Cool 10 minutes on tray, then transfer to a cooling rack for at least 5 minutes before serving.  ", R.drawable.nutella_cookies));
        sweetsRecipes.add(new Recipe("Semiya Kheer","Sweets",
                "INGREDIENTS:\n\n 1).Nestlé MILKMAID: 1 tin, 2).milk(2 ltr, toned), 3).seviyan:Roasted vermicelli, 4).raisins(4 tablespoons), 5).nuts(4 tablespoons, chopped), 6).elaichi(1/2 teaspoon).",
                "INSTRCTIONS:\n\n   Step 1: Cook the Kheer\n" +
                        "\n" +
                        "1. Bring milk to a boil in a pan.\n" +
                        "\n" +
                        "2. Add Nestlé MILKMAID and seviyan.\n" +
                        "\n" +
                        "3. Stir well and cook for 4–5 minutes until the seviyan is tender.\n" +
                        "\n" +
                        "\n" +
                        "Step 2: Add Flavours\n" +
                        "\n" +
                        "1. Mix in raisins, chopped nuts, and elaichi powder.\n" +
                        "\n" +
                        "2. Serve hot or cold as desired.     ", R.drawable.semiya_kheer));

        setupRecycler(recyclerIndian, indianRecipes);
        setupRecycler(recyclerItalian, italianRecipes);
        setupRecycler(recyclerKettle, kettleRecipes);
        setupRecycler(recyclerSweets, sweetsRecipes);
    }

    private void setupRecycler(RecyclerView recyclerView, List<Recipe> recipes){
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        RecipeAdapter adapter = new RecipeAdapter(recipes, this);
        recyclerView.setAdapter(adapter);
    }
}


