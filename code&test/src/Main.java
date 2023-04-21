public class Main {
    public static void main(String[] args){
        RecipeDataBase db = new RecipeDataBase();
        Recipe recipe = new Recipe("Pasta", new String[]{"Pasta", "Tomato", "Cheese"}, "Italian", new String[]{"Boil Pasta", "Add Tomato", "Add Cheese"});
        db.addRecipe(recipe);
    }

}


// Make a recipe class with name, list of ingredients, category, instructions and optional image
class RecipeDataBase {
    Recipe[] recipes;
    public RecipeDataBase(Recipe[] recipes) {
        this.recipes = recipes;
    }
    //Init Empty DataBase
    public RecipeDataBase() {
        this.recipes = new Recipe[0];
    }
    //Search Recipe by name
    public Recipe searchRecipeByName(String name) {
        for (Recipe recipe : recipes) {
            if (recipe.name.equals(name)) {
                return recipe;
            }
        }
        return null;
    }
    //Add Recipe to dataBase
    public void addRecipe(Recipe recipe) {
        Recipe[] newRecipes = new Recipe[recipes.length + 1];
        for (int i = 0; i < recipes.length; i++) {
            newRecipes[i] = recipes[i];
        }
        newRecipes[newRecipes.length - 1] = recipe;
        recipes = newRecipes;
    }
}
class Recipe {
    String name;
    String[] ingredients;
    String category;
    String[] instructions;
    String image;
    //init method
    public Recipe(String name, String[] ingredients, String category, String[] instructions, String image) {
        this.name = name;
        this.ingredients = ingredients;
        this.category = category;
        this.instructions = instructions;
        this.image = image;
    }
    public Recipe(String name, String[] ingredients, String category, String[] instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.category = category;
        this.instructions = instructions;
    }
}