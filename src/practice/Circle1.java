package practice;

public class Circle1 extends House {

    private int radius;

    public Circle1(String name, int radius) {
        super(name);
        setRadius(radius);
    }

    @Override
    public double calculate() {
        return Math.PI*radius*radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "radius=" + radius +
                "name=" + getName() +
                "area=" + calculate() +
                '}';
    }
}
