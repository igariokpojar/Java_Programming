package practice;

public class Square  extends House{

    private int length;

    public Square(String name, int length) {
        super(name);
        setLength(length);
    }

    @Override
    public double calculate() {
        return length*length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name=" + getName() +
                "area=" + calculate() +
                '}';
    }
}
