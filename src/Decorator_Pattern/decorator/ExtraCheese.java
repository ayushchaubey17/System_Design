package Decorator_Pattern.decorator;

import Decorator_Pattern.Pizza;

public class ExtraCheese extends Decorator {
    Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
