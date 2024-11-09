package design_Patterns.singleTon;

public class EagerInitialization {
    private  static  EagerInitialization eagerInitialization = new EagerInitialization();


    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }

}
