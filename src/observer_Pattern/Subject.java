    package observer_Pattern;

    public interface Subject {
        void addSubscriber(Observer obj);
        void removeSubscriber(Observer obj);
        void notifyOnVideoUpload(String title);
    }
