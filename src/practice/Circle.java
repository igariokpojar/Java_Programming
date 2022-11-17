package practice;

public class Circle {

  private double radius;
  private static int numberOfCircles;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if(radius<0){
      System.out.println(" Radius cannot be lower than zero previous value is stored as radius");
      return;
//assign previous value of radius
    }
    this.radius = radius;
  }

  public Circle(){
    numberOfCircles++;

  }

  public Circle(double radius) {
    this();
    this.radius = radius;
  }


  public double area(){
    return Math.PI*radius*radius;
  }
  public double perimeter(){
    return 2* Math.PI*radius;
  }

  public static int getNumberOfCircles(){
    System.out.println(" the number of circles is "+ numberOfCircles);
    return numberOfCircles;
  }

  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            " Area= "+ area()+
            " Perimeter= "+perimeter()+
            " number of Circles "+ numberOfCircles+
            '}';
  }

    }
/*
 //define two fields radius(necessary for all calculations)
    //and numberOfCircle(keep the info of how many object was created from this class).
    //decide the type of your variables (static or instance)




    //create default and parameterized constructors
    //default constructor should increase the number of object when a new object created


    //parameterized constructor should increase the number of object when a new object created.
    //and not allowed to initialize object with the radius value lower than Zero.


    //create getter and setter methods for radius.
    //getter





    //setter if the value of radius is lower than zero keep the previous value.


    //do not allow any object to change value of static variable just get the current
    //value of numberOfCircle




    //calculate area of Circle




    //calculate perimeter of Circle
 */



