import design_Patterns.singleTon.LazyInitialization;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       LazyInitialization obj1=  LazyInitialization.getInstance();
       LazyInitialization obj2=  LazyInitialization.getInstance();
       LazyInitialization obj3=  LazyInitialization.getInstance();
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj1.hashCode());
     String indentedText = """
                                  This is a line.
                                  This is another line.
                                  This is the third line.
                              """;

     String str = "    Tutorials Point            ";
     System.out.println("The length of the string before stripping is: " + str.length());
     System.out.println("The string without stripping is: " + str);
     String t = str.stripIndent();
     System.out.println("The length of the string after stripping is: " + t.length());
     System.out.println("The string with stripping is:" + t);
    }
}