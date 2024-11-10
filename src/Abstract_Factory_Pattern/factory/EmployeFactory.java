package Abstract_Factory_Pattern.factory;

import Abstract_Factory_Pattern.Employee;

public class EmployeFactory {

    public  static Employee getEmployee(EmployeeAbstractFactory factory, String type) {
      return  factory.createEmployee(type);
    }
}
