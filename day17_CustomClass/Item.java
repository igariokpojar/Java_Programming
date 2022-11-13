package day17_CustomClass;

public class Item {
    public String name;
    public int unitPrice;
    public int quantity;

    public void setInfo(String name,int unitPrice,int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(int unitPrice,int quantity){
        double totalPrice = unitPrice*quantity;
        return totalPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
