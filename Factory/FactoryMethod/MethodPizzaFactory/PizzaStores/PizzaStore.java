package FactoryMethod.MethodPizzaFactory.PizzaStores;

import FactoryMethod.MethodPizzaFactory.Pizzas.Pizza;

public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
