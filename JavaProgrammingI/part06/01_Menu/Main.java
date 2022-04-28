import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String mealName) {
        if (!meals.contains(mealName)) {
            meals.add(mealName);
        }
    }
    
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
}
