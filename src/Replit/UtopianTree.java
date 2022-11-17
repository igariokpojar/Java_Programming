package Replit;

public class UtopianTree {
    public static void main(String[] args) {
        int i=1;

        int tree_Size=0;

        while(i<=10)

        {

            if(i==1 || i==2 || i==3)

            {

                System.out.println("year "+i+" - growth "+1+" cm");

                tree_Size+=1;

                System.out.println("tree size: "+tree_Size+" cm");

            }

            else{

                System.out.println("year "+i+" - growth "+2+" cm");

                tree_Size+=2;

                System.out.println("tree size: "+tree_Size+" cm");

            }



            i=i+1;

        }
    }
}
/*
Use a loop to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years,
and then afterwards it grows by 2 cm every year. Show the growth of the tree each year up to year 10. See the example flow below.
Use the format:
year x - growth x cm
tree size: x cm

where the 'x' values are different values of year, the growth amount, and the total tree size up to that year
 */