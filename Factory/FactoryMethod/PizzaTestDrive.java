package FactoryMethod;

import FactoryMethod.MethodPizzaFactory.PizzaStores.ChicagoPizzaStore;
import FactoryMethod.MethodPizzaFactory.PizzaStores.NYPizzaStore;
import FactoryMethod.MethodPizzaFactory.PizzaStores.PizzaStore;
import FactoryMethod.MethodPizzaFactory.Pizzas.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
      
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        store = new ChicagoPizzaStore();
        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
