package practice;

public class Rectangles extends House{

    public  Rectangles(String name, int length, int wide) {
        super(name);
        setLength(length);
        setWide(wide);
    }
    private int length;
    private int wide;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    @Override
    public double calculate() {
        return length*wide;
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "length=" + length +
                ", wide=" + wide +
                "name=" + getName() +
                "area=" + calculate() +
                '}';

    }
}
