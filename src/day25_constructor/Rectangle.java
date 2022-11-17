package day25_constructor;

public class Rectangle {

   public  double length, width;

   public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
   }

   public  double are(){
      return length*width;
   }

   public String toString() {
      return "Rectangle{" +
              "length=" + length +
              ", with=" + width +
              ", area=" + are() +
              '}';


   }
}
