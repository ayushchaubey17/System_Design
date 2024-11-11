package strategy_pattern.with;

public class Vehicle {
    private  DriveStrategy driverObj;

    public Vehicle(DriveStrategy driverObj) {
        this.driverObj = driverObj;
    }

    public void driving() {
        driverObj.drive();
    }

}


class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportDriving());
    }
}

class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriving());
    }
}

class SportsVehicle extends Vehicle {
    public SportsVehicle( ) {
        super(new SportDriving());
    }
}

