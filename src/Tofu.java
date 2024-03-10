public class Tofu extends Protein{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating tofu...");
    }

    Tofu(){
        createProtein();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printProtein();
        System.out.print("Tofu ");
    }
}
