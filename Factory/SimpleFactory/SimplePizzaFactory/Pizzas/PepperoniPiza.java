package SimpleFactory.SimplePizzaFactory.Pizzas;

public class PepperoniPiza extends Pizza {
    public PepperoniPiza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated Parmesan Cheese");
    }
}
