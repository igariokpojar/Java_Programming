package day26_statics;

import java.time.LocalDate;

public class Server {

    public String name;
    public int employeeId;
    public double HourlyRate;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeId, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeId = employeeId;
        HourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder(){
        System.out.println(name + " is taken an order");
    }
    public void cleanTable(){
        System.out.println(name  + " is cleaning the table");
    }

    public String toString() {
        if (fullTime) {
            return "Server{" +
                    "name='" + name + '\'' +
                    ", id=" + employeeId +
                    ", hourlyRate=" + HourlyRate +
                    ", hire_date=" + hire_date +
                    ", full-time" +
                    '}';
        }
        return "Server{" +
                "name='" + name + '\'' +
                ", id=" + employeeId +
                ", hourlyRate=" + HourlyRate +
                ", hire_date=" + hire_date +
                ", part-time" +
                '}';

    }

}
/*
4. Restaurant Task:
		4.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean), hire_date (LocalDate)

			Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */
