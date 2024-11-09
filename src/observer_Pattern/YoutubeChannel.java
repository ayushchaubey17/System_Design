package observer_Pattern;

import java.util.ArrayList;

public class YoutubeChannel implements Subject {
    private  ArrayList<Observer> subsrcribers = new ArrayList<>();
    @Override
    public void addSubscriber(Observer obj) {
        subsrcribers.add(obj);
    }

    @Override
    public void removeSubscriber(Observer obj) {
        subsrcribers.remove(obj);
    }

    @Override
    public void notifyOnVideoUpload(String title) {
        for(Observer subscriber:subsrcribers ){
            subscriber.notifyOnVideo(title);
        }
    }
}
