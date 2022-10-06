import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/*
TO DO:
- Reader should ideally only read in desired recipe's line
- Read .csv file into an array instead of a list (doesn't matter too much here)
 */

public class ViewRecipe {
    public static void  wholeRecipe(List<List<String>> recipe, int recNum) {
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
        System.out.println("Recipe Complete");

    }

    public static void  lineByLine(List<List<String>> recipe, int recNum) {
        //Arbitrary recipe number for testing - change later when search function complete
        //int recNum = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 2, j = 1;
        System.out.println(recipe.get(recNum).get(0));

        System.out.println("\nIngredients:");
        while (!recipe.get(recNum).get(i).equals("|")) {
            System.out.println(recipe.get(recNum).get(i));
            i++;
        }
        i++;

        while(true) {
            System.out.println("\nPress enter to proceed to instructions");
            String next = null;
            try {
                next = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (next.isEmpty()) {
                break;
            }
        }

        System.out.println("\nDirections:");
        while (!recipe.get(recNum).get(i).equals("|")) {
            System.out.println(j + ". " + recipe.get(recNum).get(i));
            i++;
            j++;

            while(true) {
                System.out.println("\nPress enter for next instruction");
                String next = null;
                try {
                    next = reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (next.isEmpty()) {
                    break;
                }
            }
        }

        System.out.println("Recipe Complete");

    }
}
