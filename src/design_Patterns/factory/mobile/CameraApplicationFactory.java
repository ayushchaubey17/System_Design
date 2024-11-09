package design_Patterns.factory.mobile;

public class CameraApplicationFactory extends ApplicationFactory {
    @Override
    public Application getApp() {
        return new CameraApplication();
    }
}
