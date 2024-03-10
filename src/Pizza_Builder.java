public class Pizza_Builder {
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

    public Pizza_Builder(){

    }

    public Pizza_Builder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public Pizza_Builder setSize(String size) {
        this.size = size;
        return this;
    }

    public Pizza_Builder setPepperoni() {
        this.pepperoni = "pepperoni ";
        return this;
    }

    public Pizza_Builder setSausage() {
        this.sausage = "sausage ";
        return this;
    }

    public Pizza_Builder setMushrooms() {
        this.mushrooms = "mushrooms ";
        return this;
    }

    public Pizza_Builder setBacon() {
        this.bacon = "bacon ";
        return this;
    }

    public Pizza_Builder setOnions() {
        this.onions = "onions ";
        return this;
    }

    public Pizza_Builder setExtra_cheese() {
        this.extra_cheese = "extra_cheese ";
        return this;
    }

    public Pizza_Builder setPeppers() {
        this.peppers = "peppers ";
        return this;
    }

    public Pizza_Builder setChicken() {
        this.chicken = "chicken ";
        return this;
    }

    public Pizza_Builder setOlives() {
        this.olives = "olives ";
        return this;
    }

    public Pizza_Builder setSpinach() {
        this.spinach = "spinach ";
        return this;
    }

    public Pizza_Builder setTomato_and_basil() {
        this.tomato_and_basil = "tomato_and_basil ";
        return this;
    }

    public Pizza_Builder setBeef() {
        this.beef = "beef ";
        return this;
    }

    public Pizza_Builder setHam() {
        this.ham = "ham ";
        return this;
    }

    public Pizza_Builder setPesto() {
        this.pesto = "pesto ";
        return this;
    }

    public Pizza_Builder setSpicy_pork() {
        this.spicy_pork = "spicy_pork ";
        return this;
    }

    public Pizza_Builder setHam_and_pineapple() {
        this.ham_and_pineapple = "ham_and_pineapple ";
        return this;
    }

    public Pizza createPizza(){
        return new Pizza(chain, size, pepperoni, sausage, mushrooms, bacon, onions, extra_cheese, peppers, chicken, olives, spinach, tomato_and_basil, beef, ham, pesto, spicy_pork, ham_and_pineapple);
    }
}
