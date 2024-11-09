package design_Patterns.factory.mobile;

public class User {
    public static void main(String[] args) {

        ApplicationFactory applicationFactory = new CameraApplicationFactory();
       Application app = applicationFactory.getApp();
        System.out.println(app.about());
    }
}
