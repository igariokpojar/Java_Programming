package interview;

public class MidNumber {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=15;
        String result="";

        if(b>a&&b<c)
        {result= b+" is the median number.";}
        if(a>b&&a<c)
        {result=a+" is the median number.";}
        if(c>a&&c<b)
        {result=c+" is the median number.";}

        System.out.println( result);

    }
}

