package day4_concatination;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Aron Kissinger";
        String buildingNumber = "136211A";
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        String zipCode = "22030";

        System.out.println("Your Shipping address is:");
        System.out.println("\t" + name);
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" +  city  + ", "  + state + " " + zipCode);
        System.out.println("_____________________________________");

        System.out.println("Your Shipping address is:\n\t" + name + " "
                + buildingNumber + "\n" +
                "\t" + streetName + " " + city + "," + " "  + state + " " + zipCode  );








    }
}
/*
Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger 13621A
Legacy Circle Fairfax, VA 22030

 */