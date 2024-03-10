public class Pistachio extends Carbs{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating pistachio...");
    }

    Pistachio(){
        createCarbs();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printCarbs();
        System.out.print("Pistachio ");
    }
}
