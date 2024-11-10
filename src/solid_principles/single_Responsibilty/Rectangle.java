package solid_principles.single_Responsibilty;

public class Rectangle {
  int height;
  int length;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int getArea() {
        return this.length* this.height;
    }

}


class Square extends Rectangle {
    @Override
    public void setHeight(int height) {
        this.height  = height;
        this.length = height;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.height = height;

    }


}


class Main1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setHeight(20);
        System.out.println(rectangle.getArea());

        Rectangle square = new Square();
        System.out.println(square.getArea());

    }
}
