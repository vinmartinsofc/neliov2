package Vectors.Vec4;

import java.security.SecureRandom;

public class Vec4 {
    public static void main(String[] args) {
        double[] realList;
        double highest;
        int position = 0;
        int count = 0;
        SecureRandom secureRandom = new SecureRandom();

        realList = new double[1 + secureRandom.nextInt(50)];
        highest = realList[0];

        for (int i = 0; i < realList.length; i++) {

            realList[i] = 1 + secureRandom.nextDouble(100);

            if (realList[i] > highest) {
                highest = realList[i];
                position = i;
            }
        }

            System.out.printf("HIGHEST: %.2f%n", highest);
            System.out.printf("POSITION: %d%n", position);

        System.out.println("The numbers were: ");

        for (double fullList : realList) {
            count++;
            System.out.printf("%5.2f ", fullList);

            if (count % 5 == 0) {
                System.out.println( );
            }

        }



    }
}
