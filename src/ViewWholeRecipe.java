import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
TO DO:
- Reader should ideally only read in desired recipe's line
- Read .csv file into an array instead of a list (doesn't matter too much here)
 */

public class ViewWholeRecipe {
    public static void  main(List<List<String>> recipe, int recNum) {
        //Arbitrary recipe number for testing - change later when search function complete
        //int recNum = 1;

        int i = 2, j = 1;
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
