package SimpleFactory.SimplePizzaFactory;

import SimpleFactory.SimplePizzaFactory.Pizzas.CheesePizza;
import SimpleFactory.SimplePizzaFactory.Pizzas.ClamPizza;
import SimpleFactory.SimplePizzaFactory.Pizzas.PepperoniPiza;
import SimpleFactory.SimplePizzaFactory.Pizzas.Pizza;
import SimpleFactory.SimplePizzaFactory.Pizzas.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPiza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
