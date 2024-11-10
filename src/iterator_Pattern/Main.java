package iterator_Pattern;


public class Main {
    public static void main(String[] args) {
    UserManagement userManagement = new UserManagement();
    userManagement.addUser(new User("ayush"));
    userManagement.addUser(new User("mohan"));
    userManagement.addUser(new User("sohan"));
    userManagement.addUser(new User("rohan"));
    userManagement.addUser(new User("ganesh"));

    MyIterator iterator = userManagement.getIterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
    }
}
