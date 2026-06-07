package Vectors.Vec4;

import java.security.SecureRandom;
import java.util.Scanner;

public class Vec4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] realList;
        double highest = 0;
        SecureRandom secureRandom = new SecureRandom();

        realList = new double[1 + secureRandom.nextInt(10)];

        for (int i = 0; i < realList.length; i++) {
            realList[i] = 1 + secureRandom.nextDouble(100);
            if (realList[i] > highest) {
                highest = realList[i];
            }
        }

        if (highest > 0) {
            System.out.printf("Highest: %.2f%n", highest);
        }


    }
}
