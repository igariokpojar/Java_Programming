package day15_wileLoop;

import java.util.Scanner;

public class RomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to reserve a room? (yes/no)");
        String yesOrNo = input.next().toLowerCase();

        while(!(yesOrNo.equals("yes") || yesOrNo.equals("no"))){
            System.err.println("Invalid entry! Please re-enter");
            yesOrNo = input.next();
        }
        if(yesOrNo.equals("yes")) {

            System.out.println("Please select a room (King, queen, single)");
            String room = input.next().toLowerCase();

            while(!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.err.println("Invalid entry! Please re-enter");
                room = input.next();
            }
            String result = (room.equals("king"))?"King bed - $120"
                    :(room.equals("queen"))? "Queen bed - $100"
                    :"Single bed - $80";
            System.out.println("You selected: " +result);


        }else{
            System.out.println("Have a nice day");
        }


        input.close();
    }
}
/*
8. Create a class called RomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */