package design_Patterns.factory;

public class WebEmployee extends Employee {

    public WebEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public void salary() {
        System.out.println("salary is 30000");

    }
}
