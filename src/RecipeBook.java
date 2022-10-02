import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RecipeBook {

    public static void main(String[] args) throws IOException {

        String welcomeMessage = """

                 ____                         _
                |  _ \\  ___ _ __   __ _ _   _(_)_ __
                | | | |/ _ \\ '_ \\ / _` | | | | | '_ \\
                | |_| |  __/ | | | (_| | |_| | | | | |
                |____/ \\___|_| |_|\\__, |\\__,_|_|_| |_|
                                  |___/
                        """;
        welcomeMessage += "\n\nWelcome to the Recipe Book!\nEnter a command to get started.\ntype 'help' for commands or 'exit' to quit\n";

        System.out.println(welcomeMessage);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            System.out.println("\nenter a command: ");
            String input = reader.readLine();
            if (input.toLowerCase().equals("exit")) {
                break;
            }

            switch (input.toLowerCase()) {
                case "help" -> System.out.println("""
                        help - display this message
                        add - add a recipe
                        list - list all recipes
                        search - search for a recipe
                        exit - exit the program
                        """);
                case "add" -> System.out.println("add");
                case "list" -> System.out.println("list");
                case "search" -> System.out.println("search");
                default -> System.out.println("invalid command");
            }
        }

    }

}
