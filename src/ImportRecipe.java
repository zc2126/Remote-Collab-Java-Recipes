import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImportRecipe {
    public static List main() {
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

        return recipe;
    }
}
