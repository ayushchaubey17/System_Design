package adaptor_Patterns;

public class AdaptorCharger implements  AppleCharger{

    private SamsungCharger charger;

    public AdaptorCharger(SamsungCharger samsungCharger) {
        this.charger = samsungCharger;
    }

    @Override
    public void chargeIphone() {
        System.out.println("chargin by adaptor");
    }
}
