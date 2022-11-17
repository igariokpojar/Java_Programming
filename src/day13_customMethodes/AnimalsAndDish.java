package day13_customMethodes;

public class AnimalsAndDish {
    public static void main(String[] args) {
        feast("potatoes", "potatoes");
        System.out.println(feast("potatoes","potatoe"));
    }

    public static boolean feast(String beast, String dish) {
        return (beast.charAt(0)==dish.charAt(0)&&beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1));






       // String shou = beast.substring(0);
       // String shou2 = dish.substring(0);
       // String wei = beast.substring(beast.length() - 1, beast.length());
        //String wei2 = dish.substring(dish.length() - 1, dish.length());
        //if (shou.equals(shou2) && wei.equals(wei2)) {
          //  return true;
        //} else {
            //return false;
        }

    }


/*   second methode
return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
 */