package iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    private List<User> users = new ArrayList<>();



    public void addUser(User user) {
        users.add(user);
    }


    public MyIterator getIterator() {
        return new MyIteratorImp(users);
    }




}