import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command, fileName, searched;
        boolean goOn = true; 
        ArrayList<ArrayList> recipes;
        
        System.out.println("File to read: ");
        fileName = scanner.nextLine();
        recipes = getRecipes(fileName);
        
        System.out.println(
            "Commands:\n" +
            "list - lists the recipes\n" +
            "stop - stops the program\n" +
            "find name - searches recipes by name\n" +
            "find cooking time - searches recipes by cooking time\n" +
            "find ingredient - searches recipes by ingredient"
        );
        while(goOn) {
            System.out.println("Enter command: ");
            command = scanner.nextLine();
            
            switch(command) {
                case "stop":
                    goOn = false;
                    break;
                case "list":
                    printRecipes(recipes);
                    break;
                case "find name":
                    System.out.println("Searched word: ");
                    searched = scanner.nextLine();
                    searchRecipeByName(searched, recipes);
                    break;
                case "find cooking time":
                    System.out.println("Max cooking time: ");
                    searched = scanner.nextLine();
                    searchRecipeByTime(searched, recipes);
                    break;
                case "find ingredient":
                    System.out.println("Ingredient: ");
                    searched = scanner.nextLine();
                    searchRecipeByIngredient(searched, recipes);
                    break;
            }
        }
    }
    
    public static ArrayList getRecipes(String fileName) {
        ArrayList<String> recipe = new ArrayList<>();
        ArrayList<ArrayList> recipes = new ArrayList<>();
        String current;
        try (Scanner fileData = new Scanner(Paths.get(fileName))) {
            while(fileData.hasNextLine()) {
                current = fileData.nextLine();
                if(!current.equals("")) {
                   recipe.add(current);
                } else {
                    recipes.add(new ArrayList<>(recipe));
                    recipe.clear();
                }
            }
            recipes.add(new ArrayList<>(recipe));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return recipes;
    }
    
    public static void printRecipes(ArrayList<ArrayList> recipes) {
        for(ArrayList recipe : recipes) {
            System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
        }
    }
    
    public static void searchRecipeByName(String searched, ArrayList<ArrayList> recipes) {
        for (ArrayList<String> recipe : recipes) {
            if (recipe.get(0).contains(searched)) {
                System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
            }
        }
    }

    public static void searchRecipeByTime(String searched, ArrayList<ArrayList> recipes) {
        int maxTime = Integer.valueOf(searched);
        for (ArrayList<String> recipe : recipes) {
            if (Integer.valueOf(recipe.get(1)) <= maxTime) {
                System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
            }
        }
    }
    
    public static void searchRecipeByIngredient(String searched, ArrayList<ArrayList> recipes) {
        int i;;
        for (ArrayList<String> recipe : recipes) {
            for (i = 2; i < recipe.size(); ++i) {
                if (recipe.get(i).equals(searched)) {
                    System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
                    break;
                }
            }
        }
    }
}
