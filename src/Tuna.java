public class Tuna extends Fats{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating tuna...");
    }

    Tuna(){
        createFats();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printFats();
        System.out.print("Tuna ");
    }
}
