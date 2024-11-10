package Abstract_Factory_Pattern.factory;

import Abstract_Factory_Pattern.BackEndAndroidDevloper;
import Abstract_Factory_Pattern.Employee;
import Abstract_Factory_Pattern.FrontEndAndroidDevloper;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee(String type) {
        if (type=="front")
            return new FrontEndAndroidDevloper();
        else return new BackEndAndroidDevloper();
    }
}
