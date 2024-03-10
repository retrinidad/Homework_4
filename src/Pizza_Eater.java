public class Pizza_Eater {
    public static void main(String[] args){
        Pizza pizza_hut_1 = new Pizza_Builder().setChain("Pizza Hut").setSize("Small").setPepperoni().setBacon().setExtra_cheese().createPizza();
        Pizza pizza_hut_2 = new Pizza_Builder().setChain("Pizza Hut").setSize("Medium").setChicken().setPeppers().setPesto().setMushrooms().setOlives().setSpinach().createPizza();
        Pizza pizza_hut_3 = new Pizza_Builder().setChain("Pizza Hut").setSize("Large").setBacon().setHam().setSausage().setSpicy_pork().setHam_and_pineapple().setPeppers().setBeef().setSpinach().setOnions().createPizza();

        pizza_hut_1.eat();
        pizza_hut_2.eat();
        pizza_hut_3.eat();

        Pizza pizza_hut_4 = new Pizza_Builder().setChain("Pizza Hut").setSize("Large").setBacon().setChicken().setPesto().createPizza();
        Pizza pizza_hut_5 = new Pizza_Builder().setChain("Pizza Hut").setSize("Small").setHam().setSpicy_pork().createPizza();

        pizza_hut_4.eat();
        pizza_hut_5.eat();

        Pizza little_caesars_1 = new Pizza_Builder().setChain("Little Caesars").setSize("Medium").setHam_and_pineapple().setOlives().setExtra_cheese().setMushrooms().setTomato_and_basil().setBacon().setSpinach().setSausage().createPizza();
        Pizza little_caesars_2 = new Pizza_Builder().setChain("Little Caesars").setSize("Small").setHam().setPepperoni().setBeef().setBacon().setExtra_cheese().setSpicy_pork().createPizza();

        little_caesars_1.eat();
        little_caesars_2.eat();

        Pizza dominos_1 = new Pizza_Builder().setChain("Dominos").setSize("Small").setBeef().createPizza();
        Pizza dominos_2 = new Pizza_Builder().setChain("Dominos").setSize("Large").setBacon().setOlives().setPesto().createPizza();

        dominos_1.eat();
        dominos_2.eat();
    }

}
