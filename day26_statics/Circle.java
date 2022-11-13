package src.day26_statics;

public class Circle {

    public static double pi = 3.14;
    public double radius, diameter;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public double calcArea() {
        return pi * radius * radius;
    }

    public double calcPerimeter() {
        return 2 * pi * radius;
    }

    public static double printPi() {
        return pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + printPi() +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}


/*
Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement

 */

