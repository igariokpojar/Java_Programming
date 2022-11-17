package day7IfStatement._IfStatement;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 11;
        int n3 = 15;
        String result = "";
        if (n1>=n2 && n1<=n2 && n1==n2){result = "n1&n2 are equal";}
        if (n2>=n3 && n2<=n3 && n2==n3){result = "n2&n3 are equal";}
        if (n1>=n3 && n1<=n3 && n1==n3){result = "n1&n3 are equal";}
        if (n1==n2 && n2==n3 && n1==n3){result = "all equal";}
        if (n1!=n2 && n2!=n3 && n1!=n3){result = "all not equal";}
        System.out.println("result = " + result);


    }

}
/*
Create a class named EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are equal ==>print "n3&n1 are equal"
				if none of them are equal ==> none of them are equal


 */