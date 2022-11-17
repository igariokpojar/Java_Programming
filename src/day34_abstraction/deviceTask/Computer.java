package day34_abstraction.deviceTask;

public class Computer extends Device {

    private String madeIn,operationSystem;

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, String madeIn, String operationSystem) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
        setOperationSystem(operationSystem);
        setMadeIn(madeIn);
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        if (!(madeIn.equalsIgnoreCase("USA")||madeIn.equalsIgnoreCase("China"))){
            System.err.println("Invalid country: "+ madeIn);
            System.exit(1);
        }
        this.madeIn = madeIn;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        if (!(operationSystem.equalsIgnoreCase("Windows")||operationSystem.equalsIgnoreCase("IOS")
                ||operationSystem.equalsIgnoreCase("Linux"))){
            System.err.println("Invalid Operation System ");
            System.exit(1);
        }
        this.operationSystem = operationSystem;
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " is on");

    }

    @Override
    public void turnOf() {
        System.out.println(getModel() + " is off");

    }
}
/*
Create a child abstract class of Device named Computer:

					Add any extra methods if needed
 */