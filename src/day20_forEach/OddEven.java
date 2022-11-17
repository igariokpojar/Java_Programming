package day20_forEach;

public class OddEven {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        int oddC = 0;
        int evenC = 0;

        for (int each : arr) {
            if(each%2==0){
                evenC++;
            }else {
                oddC++;
            }

        }
        System.out.println("evenC = " + evenC);
        System.out.println("oddC = " + oddC);



    }
}
/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */
/*int num = 0;
    int odd = 0;
    for(int i = 0;i<nums.length;i++){
        if(i%2==0){
        num++;
        }else{
        odd++;
        }
        }
        System.out.print(num);
        System.out.println(odd);

 */