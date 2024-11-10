package solid_principles.single_Responsibilty.dependencyInversionPrinciple;

public class WiredMouse implements Mouse {
    @Override
    public void draging() {
        System.out.println("mouse by wire");
    }
}