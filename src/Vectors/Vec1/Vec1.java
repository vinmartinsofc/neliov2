package Vectors.Vec1;

import java.util.Scanner;

public class Vec1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = scanner.nextDouble();
        }
        
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.println("Avg height: " + avg);

        scanner.close();
    }
}
