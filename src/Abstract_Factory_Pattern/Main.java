package Abstract_Factory_Pattern;

import Abstract_Factory_Pattern.factory.EmployeFactory;
import Abstract_Factory_Pattern.factory.WebDeveloperFactory;

public class Main {
    public static void main(String[] args) {
        Employee backendWebdeveloper = EmployeFactory.getEmployee(new WebDeveloperFactory(),"back");
        backendWebdeveloper.details();
    }
}
