public class Chicken extends Protein{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating chicken...");
    }

    Chicken(){
        createProtein();
        createMacronutrient();
    }

    public void printMacronutrient(){
        printProtein();
        System.out.print("Chicken ");
    }
}
