
public class Macronutrient_Driver {
    public static void main(String[] args){

        Customer Customer_1 = new Customer("Rick", "No Restriction");
        Customer Customer_2 = new Customer("Judith", "Paleo");
        Customer Customer_3 = new Customer("Carol", "Vegan");
        Customer Customer_4 = new Customer("Daryl", "Nut Allergy");
        Customer Customer_5 = new Customer("Glen", "No Restriction");
        Customer Customer_6 = new Customer("Shane", "Paleo");


        Meal Meal_1 = new Meal();
        Meal Meal_2 = new Meal();
        Meal Meal_3 = new Meal();
        Meal Meal_4 = new Meal();
        Meal Meal_5 = new Meal();
        Meal Meal_6 = new Meal();


        Protein_Factory proteinFactory = Protein_Factory.getInstance();
        Carbs_Factory carbsFactory = Carbs_Factory.getInstance();
        Fats_Factory fatsFactory = Fats_Factory.getInstance();


        Meal_1.prepareMeal(proteinFactory, carbsFactory, fatsFactory, Customer_1.getDiet_plan());
        Meal_2.prepareMeal(proteinFactory, carbsFactory, fatsFactory, Customer_2.getDiet_plan());
        Meal_3.prepareMeal(proteinFactory, carbsFactory, fatsFactory, Customer_3.getDiet_plan());
        Meal_4.prepareMeal(proteinFactory, carbsFactory, fatsFactory, Customer_4.getDiet_plan());
        Meal_5.prepareMeal(proteinFactory, carbsFactory, fatsFactory, Customer_5.getDiet_plan());
        Meal_6.prepareMeal(proteinFactory, carbsFactory, fatsFactory, Customer_6.getDiet_plan());

        Customer_1.setMeal(Meal_1);
        Customer_2.setMeal(Meal_2);
        Customer_3.setMeal(Meal_3);
        Customer_4.setMeal(Meal_4);
        Customer_5.setMeal(Meal_5);
        Customer_6.setMeal(Meal_6);

        Customer_1.printDietType();
        Customer_1.printMeal();
        Customer_2.printDietType();
        Customer_2.printMeal();
        Customer_3.printDietType();
        Customer_3.printMeal();
        Customer_4.printDietType();
        Customer_4.printMeal();
        Customer_5.printDietType();
        Customer_5.printMeal();
        Customer_6.printDietType();
        Customer_6.printMeal();


    }
}
