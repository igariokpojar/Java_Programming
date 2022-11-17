package day31_Inheritance.shape_methodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.draw();

        System.out.println("_______________________________");

        Circle circle  = new Circle(3.5);
        System.out.println(circle);

        Rectangle req = new Rectangle(2.14,24.3);
        System.out.println(req);
        req.draw();

        Triangle tri = new Triangle(12.3,14.5,24.36,45.98);
        System.out.println(tri);
        tri.draw();
    }
}
