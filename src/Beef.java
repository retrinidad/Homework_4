public class Beef extends Protein{
    @Override
    public void createMacronutrient(){ System.out.println("Creating beef.."); }

    Beef(){
        createProtein();
        createMacronutrient();
    }
    public void printMacronutrient(){
        printProtein();
        System.out.print("Beef ");
    }
}
