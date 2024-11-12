package Decorator_Pattern;

public class Margherita extends Pizza {
    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Margherita pizza";
    }
}

