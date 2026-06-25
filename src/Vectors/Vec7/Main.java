package Vectors.Vec7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("M?");
        int m = scanner.nextInt();

        System.out.print("N?");
        int n = scanner.nextInt();

        int[][] mAndN = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mAndN[i][j] = scanner.nextInt();
            }
        }

        System.out.println("X??");
        int x = scanner.nextInt();

        int left = 0;
        int right = 0;
        int down = 0;

        for (int[] vector : mAndN) {

            for (int j = 0; j < n; j++) {
                    System.out.print(vector[j] + " ");
                    if (vector[j] == x) {
//                       left = mAndN[j][vector[j]];
                    }

            }

            System.out.println();
        }


        System.out.println("Left: " + left);
        System.out.println("Right: " + right);

    }
}
