public class Sour_Cream extends Fats{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating sour cream...");
    }

    Sour_Cream(){
        createFats();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printFats();
        System.out.print("Sour Cream ");
    }
}
