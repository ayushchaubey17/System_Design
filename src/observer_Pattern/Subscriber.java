
package observer_Pattern;

public class Subscriber implements Observer {
    private  String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notifyOnVideo(String title) {
        System.out.println("hello "+this.name +" check now "+title+" video uploaded");
    }
}
