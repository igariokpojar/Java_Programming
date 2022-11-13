package day34_abstraction.CarTask2;

import day34_abstraction.CarTask2.AutoPark;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;
    void selfDriving();


}
/*
Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using exend keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();
 */