package FactoryMethod.MethodPizzaFactory;

import FactoryMethod.MethodPizzaFactory.Pizzas.CheesePizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.ClamPizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.PepperoniPiza;
import FactoryMethod.MethodPizzaFactory.Pizzas.Pizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.VeggiePizza;

public class AbstractPizzaFactory {
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
