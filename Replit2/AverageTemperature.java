package Replit2;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps

        // from saim: please update to use a loop to have a different sized arrays
        double length = temps.length;
        int sum = 0;

        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }

        double average = sum/length;

        System.out.println(average);

    }
}
