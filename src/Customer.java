public class Customer {
    String name;
    Diet diet_plan;
    Meal meal;

    Customer (String name, String diet_plan){
        this.name = name;
        this.diet_plan = new Diet(diet_plan);
    }
    String getName(){
        return name;
    }
    Diet getDiet_plan(){
        return diet_plan;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void printMeal(){
        System.out.print("Meal - ");
        meal.getProtein_portion().printMacronutrient();
        meal.getCarb_portion().printMacronutrient();
        meal.getFat_portion().printMacronutrient();
        System.out.println("");
    }

    public void printDietType(){
        System.out.println("Diet Type: " + this.diet_plan.getDiet_type());
    }
}
