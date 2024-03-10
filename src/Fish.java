public class Fish extends Protein{
    @Override
    public void createMacronutrient(){
        System.out.println("Creating fish...");
    }

    Fish(){
        createProtein();
        createMacronutrient();
    }
    public void printMacronutrient(){
        printProtein();
        System.out.print("Fish ");
    }
}
