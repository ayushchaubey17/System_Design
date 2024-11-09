package design_Patterns.factory;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = EmployeFactory.getEmployee("androId","ayush",12);
        if (employee1!=null)
            employee1.salary();



    }
}
