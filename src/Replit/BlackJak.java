package Replit;

import java.util.Scanner;

public class BlackJak {
    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                int house = s.nextInt();
                int player = s.nextInt();

                if(player>21){
                    System.out.print("player bust");
                }else if (player==house){
                    System.out.print("its a tie");
                }else if(player==21 || player>house){
                    System.out.println("player win");
                }else {
                    System.out.println("player lose");
                }

            }
}
/*
Use if statements to help the Blackjack dealer determine who won. There will be an int house value and an int player value. Use the following rules of blackjack to print out the result:
if the player score is bigger than 21, the result is player bust
if the player score is equal to the house score, the result is its a tie
if the player score is equal to 21, the result is player win
if the house score is bigger than the player score, the result is player lose
if the player score is bigger than the house score, the result is player win
Note: Can be done with separate if statement or a multi branch if statement
Main topics: if statements, primitive variables, operators
 */