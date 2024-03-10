public class Peanuts extends Fats{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating peanuts...");
    }

    Peanuts(){
        createFats();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printFats();
        System.out.print("Peanuts ");
    }
}
