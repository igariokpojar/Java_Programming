package practice;

public abstract class House {

     private String name;

    public House(String name) {
        setName(name);
    }

    public abstract  double calculate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                '}';
    }
}