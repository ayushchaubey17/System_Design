package Decorator_Pattern.decorator;

import Decorator_Pattern.Pizza;

public class Jalapeno extends Decorator {
    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+90;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with a Jalapeno";
    }
}




