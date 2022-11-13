package day08_ternary_switchstatement;

public class CydeoBatches {
    public static void main(String[] args) {
        // solution~2
        String batch = "EU";
        switch (batch) {
            case "US morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;
            case "US evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;
            case "EU":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F");
                break;
            default:
                System.out.println("c");


                System.out.println("________________________________________");

                String bach = "US morning";
                String result = "";
                if (bach == "US morning") {
                    result = "Class times are 10-5 EST. M, T, Th, F";
                } else if (bach == "US evening") {
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                } else if (bach == "EU") {
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                } else {
                    result = "invalid beach";}
                    System.out.println("result = " + result);

                System.out.println("_________________________________________________");


                }
        }
    }










/*
Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "c"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed


 */