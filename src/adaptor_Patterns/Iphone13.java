package adaptor_Patterns;

public class Iphone13 {
    private AppleCharger appleCharger;

    public Iphone13(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeApplephone() {
        appleCharger.chargeIphone();
    }

}
