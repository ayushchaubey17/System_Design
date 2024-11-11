package strategy_pattern.without;

public class Vehicle {
    public void drive() {
        System.out.println("Normal driving");
    }


}


class PassengerVehicle extends Vehicle {

}

class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Sport driving");
    }
}



//logic repeatd of SPorts vehicle
class GoodsVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Sport driving");
    }
}

 class Main {
     public static void main(String[] args) {
         Vehicle goodsvehicle = new GoodsVehicle();
         goodsvehicle.drive();
     }

}
