public class Bread extends Carbs{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating bread...");
    }

    Bread(){
        createCarbs();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printCarbs();
        System.out.print("Bread ");
    }
}
