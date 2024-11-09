package design_Patterns.factory;

public abstract class Employee {
    private  int id;
    private  String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void salary();

}
