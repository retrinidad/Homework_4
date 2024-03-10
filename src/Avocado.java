public class Avocado extends Fats{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating avocado...");
    }

    Avocado(){
        createFats();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printFats();
        System.out.print("Avocado ");
    }
}
