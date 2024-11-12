package Decorator_Pattern.decorator;

import Decorator_Pattern.Pizza;

public class Paneer extends Decorator {
    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Paneer";
    }
}
