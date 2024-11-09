package prototype_Pattern;

public class Main {
    public static void main(String[] args) throws InterruptedException,CloneNotSupportedException{

        NetworkConnnection networkConnnection1 = new NetworkConnnection("127.27001");
        networkConnnection1.loadImportantData();

        System.out.println(networkConnnection1);


        NetworkConnnection networkConnnection2 = (NetworkConnnection) networkConnnection1.clone();
        NetworkConnnection networkConnnection3 = (NetworkConnnection) networkConnnection1.clone();


        networkConnnection1.getDomains().remove(1);

        System.out.println(networkConnnection2);
        System.out.println(networkConnnection3);
        System.out.println(networkConnnection1);



    }


}
