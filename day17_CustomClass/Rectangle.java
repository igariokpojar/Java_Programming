package day17_CustomClass;

public class Rectangle {

    public double length;
    public double width;
    public double area = length*width;
    public double perimeter = 2*(length+width);

    public void setInfo(double length,double width,double area,double perimeter){
        this.length = length;
        this.width  =width;
        this.area = length*width;
        this.perimeter = 2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
