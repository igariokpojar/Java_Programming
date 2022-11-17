package day17_CustomClass;

public class Address {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public int zipCode;


    public  void setInfo(int buildingNumber,String street,String city,int zipCode){
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + " " + zipCode;
    }
}
