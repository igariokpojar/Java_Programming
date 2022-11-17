package Replit;

public class OddOrEven {
    public static void main(String[] args) {
        String even="";
        String odd="";


        for(int i=1; i<=20;i++){

            if(i%2==0){
                even+=i+" ";}
            else{

                odd+=" "+i;
            }

        }
        System.out.println(even.trim()+"\n"+odd.trim());

    }

}
