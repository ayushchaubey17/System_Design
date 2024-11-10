package solid_principles.single_Responsibilty.dependencyInversionPrinciple;

public class WiredKeyBoard implements Keyboard {
    @Override
    public void typing() {
        System.out.println("typing is working but it needs a wire");
    }



}


