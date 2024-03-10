public class Cheese extends Carbs{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating cheese...");
    }

    Cheese(){
        createCarbs();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printCarbs();
        System.out.print("Cheese ");
    }
}
