import junit.framework.TestCase;
import org.junit.Test;

public class RecipeDataBaseTest extends TestCase {
    //test add recipe
    @Test
    public void testAddRecipe() {
        RecipeDataBase recipeDataBase = new RecipeDataBase();
        Recipe recipe = new Recipe("test", new String[]{"test"}, "test", new String[]{"test"});
        recipeDataBase.addRecipe(recipe);
        assertEquals(recipeDataBase.recipes[0], recipe);
    }
    //test search recipe by name
    @Test
    public void testSearchRecipeByName() {
        RecipeDataBase recipeDataBase = new RecipeDataBase();
        Recipe recipe = new Recipe("test", new String[]{"test"}, "test", new String[]{"test"});
        recipeDataBase.addRecipe(recipe);
        assertEquals(recipeDataBase.searchRecipeByName("test"), recipe);
    }

    //test recipe exist
    @Test
    public void testRecipeExist() {
        RecipeDataBase recipeDataBase = new RecipeDataBase();
        Recipe recipe = new Recipe("test", new String[]{"test"}, "test", new String[]{"test"});
        recipeDataBase.addRecipe(recipe);
        assertTrue(recipeDataBase.recipeExist("test"));
        assertFalse(recipeDataBase.recipeExist("test2"));
    }

    //Test recipe initiation
    @Test
    public void testRecipeInit() {
        Recipe recipe = new Recipe("test", new String[]{"test"}, "test", new String[]{"test"});
        assertEquals(recipe.name, "test");
        assertEquals(recipe.ingredients[0], "test");
        assertEquals(recipe.category, "test");
        assertEquals(recipe.instructions[0], "test");
        assertNotSame(recipe.name, "test2");
        assertNotSame(recipe.ingredients[0], "test2");
        assertNotSame(recipe.category, "test2");
        assertNotSame(recipe.instructions[0], "test2");
        assertNull(recipe.image);
    }


}