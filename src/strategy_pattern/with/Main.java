package strategy_pattern.with;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new PassengerVehicle();
        vehicle.driving();
    }
}
