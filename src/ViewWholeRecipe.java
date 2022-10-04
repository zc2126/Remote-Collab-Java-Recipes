import java.io.*;
import java.util.*;

/*
TO DO:
- Reader should ideally only read in desired recipe's line
- Read .csv file into an array instead of a list (doesn't matter too much here)
 */

public class ViewWholeRecipe {
    public static void  main(String[] args) {
        String fileLoc = "Recipes.csv";

        List<List<String>> recipe = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileLoc));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                recipe.add(Arrays.asList(parts));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Arbitrary recipe number for testing - change later when search function complete
        int recNum = 2, i = 2, j = 1;
        System.out.println(recipe.get(recNum).get(0));

        System.out.println("\nIngredients:");
        while (!recipe.get(recNum).get(i).equals("|")) {
            System.out.println(recipe.get(recNum).get(i));
            i++;
        }
        i++;

        System.out.println("\nDirections:");
        while (!recipe.get(recNum).get(i).equals("|")) {
            System.out.println(j + ". " + recipe.get(recNum).get(i));
            i++;
            j++;
        }

    }
}
