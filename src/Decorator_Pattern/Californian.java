package Decorator_Pattern;

public class Californian extends Pizza {
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Californian Pizza";
    }
}

