package Decorator_Pattern;

import Decorator_Pattern.decorator.ExtraCheese;
import Decorator_Pattern.decorator.Jalapeno;
import Decorator_Pattern.decorator.Paneer;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Margherita();
        System.out.println(pizza1.cost()+" and this is "+pizza1.getDescription());

        Pizza margheritaWithextraCheese = new ExtraCheese(pizza1);

        System.out.println("the price of Margherita with extra cheese "+ margheritaWithextraCheese.cost());

        Pizza canadianWithJalapenoAndPaneerAndExtraCheese =  new ExtraCheese(new Paneer(new Jalapeno(new Canadian())));
        System.out.println("price is "+canadianWithJalapenoAndPaneerAndExtraCheese.cost()+" and this is "+canadianWithJalapenoAndPaneerAndExtraCheese.getDescription());
    }
}
