import java.io.*;
import java.util.*;

/*
TO DO:
- Reader should ideally only read in desired recipe's line
- Read .csv file into an array instead of a list (doesn't matter too much here)
 */

public class ViewRecipe {

    public static void main(ArrayList<Recipe> recipeBook) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Recipe foundRecipe = null;
        while (foundRecipe == null) {
            System.out.println("");
            System.out.println("Enter the name of a recipe, 'all' to view all recipes: ");
            String name = reader.readLine();
            System.out.println("");
            if (name.toLowerCase().equals("all")) {
                for (Recipe recipe : recipeBook) {
                    System.out.println(recipe.getName());
                }
                System.out.println("");
                continue;
            }

            for (Recipe recipe : recipeBook) {
                if (recipe.getName().toLowerCase().equals(name.toLowerCase())) {
                    foundRecipe = recipe;
                    System.out.println("\n------------------------------");
                    System.out.println("Recipe found: " + foundRecipe.getName());
                    System.out.println("");
                    break;
                }
            }
        }
        System.out.println("Enter 'whole' to view the whole recipe or 'line' to view it line by line: ");

        String input = reader.readLine();
        System.out.println("");
        if (input.toLowerCase().equals("whole")) {
            System.out.println(foundRecipe.toString());
            System.out.println("");
        } else if (input.toLowerCase().equals("line")) {
            System.out.println("");
            System.out.println("Name:\n" + foundRecipe.getName());
            System.out.println("");
            System.out.println("Ingredients: ");
            for (String ingredient : foundRecipe.getIngredients()) {
                System.out.println(ingredient);
            }
            System.out.println("");
            System.out.println("Instructions: ");
            int instruction = 0;
            while (instruction < foundRecipe.getInstructions().size()) {
                System.out.println("enter to continue or 'exit' ");
                String exit = reader.readLine();
                if (exit.toLowerCase().equals("exit")) {
                    break;
                } else {
                    System.out.println(foundRecipe.getInstructions().get(instruction));
                    System.out.println("");
                    instruction++;
                }
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
