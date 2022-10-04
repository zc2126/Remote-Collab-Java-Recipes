import java.io.*;
import java.util.*;

/*
TO DO:
- Reader should ideally only read in desired recipe's line
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
            System.out.println("Error: File not Found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
