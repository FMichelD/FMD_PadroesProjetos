package SimpleFactory.SimplePizzaFactory.Pizzas;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
    String dough;
    String sauce;

    List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void  prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }    

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append("Dough: " + dough + "\n");
        display.append("Sauce: " + sauce + "\n");
        display.append("Toppings: " + "\n");
        for(String topping : toppings) {
            display.append("\t" + topping + "\n");
        }
        return display.toString();
    }
}
