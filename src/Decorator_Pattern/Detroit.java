package Decorator_Pattern;

public class Detroit extends Pizza {
    @Override
    public int cost() {
        return 250;
    }

    @Override
    public String getDescription() {
        return "Detriot Pizza";
    }
}

