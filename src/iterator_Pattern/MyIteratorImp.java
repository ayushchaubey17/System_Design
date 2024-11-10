
package iterator_Pattern;


import java.util.List;

public class MyIteratorImp implements MyIterator {
 private    List<User> users;
 private int size;
 private  int position =0;

    public MyIteratorImp(List<User> user)
    {
        this.size = user.size();
        this.users = user;

    }

    @Override
    public boolean hasNext() {
        return  (position>=this.size)?false:true;
    }

    @Override
    public User next() {
        User user = users.get(position);
        position++;
        return user;

    }
}