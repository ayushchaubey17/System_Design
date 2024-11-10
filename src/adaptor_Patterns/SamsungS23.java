package adaptor_Patterns;

public class SamsungS23 {
    private SamsungCharger samsungCharger;

    public SamsungS23(SamsungCharger samsungCharger) {
        this.samsungCharger = samsungCharger;
    }

    public void chargeSamsung() {
        samsungCharger.chargeAndroid();
    }

}
