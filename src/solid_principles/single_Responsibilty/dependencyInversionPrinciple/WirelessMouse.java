package solid_principles.single_Responsibilty.dependencyInversionPrinciple;

public class WirelessMouse implements Mouse {
    @Override
    public void draging() {
        System.out.println("its dragging by bluetoooth");
    }
}

