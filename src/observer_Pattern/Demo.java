package observer_Pattern;

public class Demo {
    public static void main(String[] args) {
        Subject codeWithAyush = new YoutubeChannel();

        Observer subscriber1 = new Subscriber("abhishek");
        Observer subscriber2 = new Subscriber("Ankit");

        codeWithAyush.addSubscriber(subscriber1);
        codeWithAyush.addSubscriber(subscriber2);

        codeWithAyush.notifyOnVideoUpload("java string basic");


        Observer subscriber3 = new Subscriber("Basant");
        codeWithAyush.addSubscriber(subscriber3);
        codeWithAyush.removeSubscriber(subscriber1);
        codeWithAyush.notifyOnVideoUpload("java OOPs");




    }
}
