package src.day28_Encapsulation.HomeWork;

public class TestObjects {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println(rectangle);

        rectangle.setLength(10);
        rectangle.setWidth(20);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        System.out.println(rectangle);

        System.out.println("____________________________________________");

        Square square =  new Square(5);

        System.out.println(square);

        square.setSide(10);
        System.out.println(square.getSide());

        System.out.println(square);



    }
}
