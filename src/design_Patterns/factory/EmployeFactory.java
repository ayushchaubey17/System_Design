package design_Patterns.factory;

public class EmployeFactory {

    public static Employee getEmployee(String type,String name,int id) {
        if (type.trim().equalsIgnoreCase("web")) return new WebEmployee(id,name);
        else if (type.trim().equalsIgnoreCase("android")) return new AndroidEmployee(id, name);
        return null;

    }
}
