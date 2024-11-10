package adaptor_Patterns;

public class Main {
    public static void main(String[] args) {
//         Iphone13 iphone13 = new Iphone13();
//         iphone13.chargeApplephone();



        AppleCharger charger = new AdaptorCharger(new AyushAndroidCharger());
        charger.chargeIphone();

        SamsungS23 samsungS23 = new SamsungS23(new AyushAndroidCharger());
        samsungS23.chargeSamsung();
    }
}
