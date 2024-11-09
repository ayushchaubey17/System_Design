package design_Patterns.factory.mobile;

public class GameApplicationFactory {
    public Application getApp() {
        return new GameApplication();
    }
}
