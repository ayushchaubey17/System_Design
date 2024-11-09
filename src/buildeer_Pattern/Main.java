package buildeer_Pattern;

public class Main {
    public static void main(String[] args) {
        User user1 = new  User.InnerUser().setName("ayush").setPassword("Ayush@123").build();
        User user2 =new  User.InnerUser().setUsername("ayu17").setName("ayush chaubey").setPassword("Ayush@123").build();
        System.out.println(user1);
        System.out.println(user2);

    }
}
