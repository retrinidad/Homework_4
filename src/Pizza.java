public class Pizza {
    private String chain;
    private String size;
    private String pepperoni = "";
    private String sausage = "";
    private String mushrooms = "";
    private String bacon = "";
    private String onions = "";
    private String extra_cheese = "";
    private String peppers = "";
    private String chicken = "";
    private String olives = "";
    private String spinach = "";
    private String tomato_and_basil = "";
    private String beef = "";
    private String ham = "";
    private String pesto = "";
    private String spicy_pork = "";
    private String ham_and_pineapple = "";

    public Pizza(String chain, String size, String pepperoni, String sausage, String mushrooms, String bacon, String onions, String extra_cheese, String peppers, String chicken, String olives, String spinach, String tomato_and_basil, String beef, String ham, String pesto, String spicy_pork, String ham_and_pineapple){
        this.chain = chain;
        this.size = size;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extra_cheese = extra_cheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomato_and_basil = tomato_and_basil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicy_pork = spicy_pork;
        this.ham_and_pineapple = ham_and_pineapple;

    }

    public void eat(){
        System.out.println("Pizza chain: " + chain + " " + "Size: " + size + " " + "Toppings: " + pepperoni + sausage + mushrooms + bacon + onions + extra_cheese + peppers + chicken + olives + spinach + tomato_and_basil + beef + ham + pesto + spicy_pork + ham_and_pineapple);
    }
}
