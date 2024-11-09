package prototype_Pattern;
import  java.util.List;
import  java.util.ArrayList;

public class NetworkConnnection implements  Cloneable{
    private  String ip;
    private String important_data;
    private     List<String> domains ;

    public NetworkConnnection(String ip)
    {
        this.ip = ip;
        domains = new ArrayList<>();
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    public List<String> getDomains() {
        return domains;
    }

    public void loadImportantData ()  {
        System.out.println("loading Important data");
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Exception found");
        }
        this.important_data = "AYush is the password";
        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.twitter.com");
        domains.add("www.whatsappWeb.com");
    }


    @Override
    public NetworkConnnection clone() throws CloneNotSupportedException {
        //logic for clonint
        NetworkConnnection networkConnnection = new NetworkConnnection(this.ip);
        networkConnnection.important_data = this.important_data;



        for (String d :this.domains) {
            networkConnnection.getDomains().add(d);

        }

        return networkConnnection;
    }

    public  String toString(){
        return "ip is :"+this.ip +" and data is :"+this.important_data+" domains are:"+this.domains;
    }
}
