package Decorator_Pattern;

public class Canadian extends Pizza {
    @Override
    public int cost() {
        return 300;
    }

    @Override
    public String getDescription() {
        return "Canedian Pizza";
    }
}
