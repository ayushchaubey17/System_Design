package strategy_pattern.with;

public interface DriveStrategy {
    void  drive();
}

class NormalDriving implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is normal driving");
    }
}


class SportDriving implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is sport driving");
    }
}
