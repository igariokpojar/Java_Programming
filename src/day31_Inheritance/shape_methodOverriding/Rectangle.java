package day31_Inheritance.shape_methodOverriding;

public class Rectangle  extends Shape {

    private double length, wide;

    public Rectangle(double length, double wide) {
        setLength(length);
        setWide(wide);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <=0){
            System.err.println("Invalid length " + length);
        }
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        if (wide<=0){
            System.err.println("Invalid wide " + wide);
        }
        this.wide = wide;
    }

    public double area() {
        return wide * length;
    }

    public double perimeter() {
        return 2 * (wide + length);
    }

    public void draw() {
        System.out.println(getName() + " is drawing by student");
    }

    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "length=" + length +
                ", wide=" + wide +
                "name='" + getName() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() +
                '}';
    }
}