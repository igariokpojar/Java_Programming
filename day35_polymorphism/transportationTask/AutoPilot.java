package day35_polymorphism.transportationTask;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;

    void selfDrive();
}
/*
Create a sub interface of AutoPark named AutoPilot:

				abstract methods:
						autoPilot()
 */