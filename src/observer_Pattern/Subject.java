    package observer_Pattern;

    import java.util.ArrayList;

    public interface Subject {
        void addSubscriber(Observer obj);
        void removeSubscriber(Observer obj);
        void notifyOnVideoUpload(String title);
    }
