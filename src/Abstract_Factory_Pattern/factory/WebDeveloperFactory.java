package Abstract_Factory_Pattern.factory;

import Abstract_Factory_Pattern.BackEndWebDevloper;
import Abstract_Factory_Pattern.Employee;
import Abstract_Factory_Pattern.FrontEndWebDevloper;

public class WebDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee(String type) {
        if (type=="front")
            return new FrontEndWebDevloper();
        else return new BackEndWebDevloper();
    }
}
