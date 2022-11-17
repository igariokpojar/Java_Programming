package Replit;

import java.util.Scanner;

public class HTTP {
    public static void main(String[] args) {
        System.out.println("Enter status code:");
        Scanner scan=new Scanner (System.in);
        int status= scan.nextInt();

        //WRITE YOUR CODE BELOW:
        switch (status){
            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal Server Error");
            case 303:
                System.out.println("Service Unavailable");
                break;
            default:
                System.out.println("Invalid status code");}


    }
}
/*
HTTP is the protocol that governs communications between servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Use a switch statement to determine the message from the status value. Use the following chart to determine the results:
Status Codes

200: OK
201: Created
202: Accepted
307: Temporary Redirect
400: Bad Request
401: Unauthorized
403: Forbidden
404: Not Found
410: Gone
500: Internal Server Error
303: Service Unavailable
Any other number should output: Invalid status code
 */