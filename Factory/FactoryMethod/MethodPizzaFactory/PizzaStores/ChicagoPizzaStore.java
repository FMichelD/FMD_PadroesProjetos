package FactoryMethod.MethodPizzaFactory.PizzaStores;

import FactoryMethod.MethodPizzaFactory.Pizzas.ChicagoStyleCheesePizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.ChicagoStyleClamPizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.ChicagoStylePepperoniPizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.ChicagoStyleVeggiePizza;
import FactoryMethod.MethodPizzaFactory.Pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        
        if(type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }

        return null;
    }
}
