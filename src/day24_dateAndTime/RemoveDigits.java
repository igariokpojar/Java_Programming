package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigits {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$','A','B','1','2','C','D','@','!','3','4'));

            list.removeIf( p ->Character.isDigit(p));
        System.out.println(list);


    }
}
/*
Write a program that can remove all the digits from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']
 */