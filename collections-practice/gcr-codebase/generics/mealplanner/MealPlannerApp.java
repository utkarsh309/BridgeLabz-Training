package generics.mealplanner;

public class MealPlannerApp {

    // Generic method to validate and generate meal plan
    public static <T extends MealPlan> void generateMeal(Meal<T> meal) {

        if (meal.getMealPlan() != null) {
            System.out.println("Personalized Plan Generated: " +
                    meal.getMealPlan().getMealType());
        } else {
            System.out.println("Invalid meal plan");
        }
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        generateMeal(vegMeal);
        generateMeal(veganMeal);
        generateMeal(ketoMeal);
        generateMeal(proteinMeal);
    }
}

