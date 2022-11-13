package day17_CustomClass;

public class RectangleObjects {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        rec1.setInfo(4.,12, (rec1.length* rec1.width), 2*(rec1.width+ rec1.length));

        Rectangle rec2 = new Rectangle();
        rec2.setInfo(3.5,10.2,(rec2.length* rec2.width),2*(rec2.width+ rec2.length));

        System.out.println(rec1);
        System.out.println(rec2);

    }
}
