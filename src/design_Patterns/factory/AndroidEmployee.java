package design_Patterns.factory;

public class AndroidEmployee  extends   Employee{
    public AndroidEmployee(int id, String name) {
        super(id, name);
    }


    @Override
    public void salary() {
        System.out.println(" ssalary of android developer is  50k");
    }
}
