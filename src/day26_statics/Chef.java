package day26_statics;

public class Chef {

  public String name;
  public int employeeId;
  public double hourlyRate;
  public boolean fullTime;
    public int employeeID;

    public Chef(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void makeOrder(){
        System.out.println(name + " is making an order");
    }
    public void washDishes(){
        System.out.println(name + " is washing the dishes");
    }

    public String toString() {
        if (fullTime) {
            return "Chef{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", full-time" +
                    '}';
        }
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", part-time" +
                '}';
    }

}
/*
4.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */