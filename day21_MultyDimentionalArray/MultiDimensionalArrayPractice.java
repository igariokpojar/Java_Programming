package day21_MultyDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Adelina","Anna","Alexandru","Alla"};
        String[] group2 = {"Igor", "Ion","Alexandra",};
        String[] group3 = {"Vit", "Vic", "Veaceslav","Maria", "Vladimir"};
        String[] group4 = {"Linda","Catalina"};

        String[][] groups = {group1,group2,group3,group4};
        //                     0       1     2      3

        for (int i = 0; i <groups.length ; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String[] eachStudent = groups[i];
                System.out.println(Arrays.toString(eachStudent));

            }

        }
        System.out.println("____________second method________________________________________________");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup) );
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("-----------------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }

        System.out.println(groups);

        System.out.println( Arrays.toString(groups)); // toString() ==> for single dimensional arrays ONLY

        System.out.println( Arrays.deepToString(groups) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY


    }
}
