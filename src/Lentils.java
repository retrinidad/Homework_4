public class Lentils extends Carbs{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating lentils...");
    }

    Lentils(){
        createCarbs();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printCarbs();
        System.out.print("Lentils ");
    }
}
