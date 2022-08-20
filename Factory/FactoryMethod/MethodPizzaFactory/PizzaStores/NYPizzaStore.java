package FactoryMethod.MethodPizzaFactory.PizzaStores;

import FactoryMethod.MethodPizzaFactory.Pizzas.NYStyleCheesePizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.NYStyleClamPizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.NYStylePepperoniPizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.NYStyleVeggiePizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }

        return null;
    }
}
