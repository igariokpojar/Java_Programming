package day17_CustomClass;

public class Carpet {

    public double width;
    public double length;
    public double unitePrice;
    public boolean isPersian;


    public void setInfo(double width,double length,double unitePrice,boolean isPersian){
        this.width = width;
        this.length  =length;
        this.unitePrice = unitePrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        if (!isPersian){
            return unitePrice*width*length;
        }
        return 200+(length*width*unitePrice);
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitePrice=" + unitePrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
/*
Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet as
                 calculated by calcCost()


		    total price of carpet = (width*length)*unit price

		    if the carpet is persian  carpet, add 200$ to the totalPrice
 */