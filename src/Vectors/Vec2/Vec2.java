package Vectors.Vec2;

import java.util.Scanner;

public class Vec2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = Integer.parseInt(scanner.nextLine());
        int count = n;

        int[] vec2 = new int[n];

        for (int i = 0; i < vec2.length; i++) {
            System.out.print("Integers to add: ");
            int n2 = Integer.parseInt(scanner.nextLine());
            vec2[i] = n2;
            System.out.println("There is " + --count + " to add!");
        }

        if (vec2.length > 0) {
            System.out.printf("%2s%n", "Negatives: ");
        }

        for (int intNumbers : vec2) {
            if (intNumbers < 0) {
                System.out.println(intNumbers);
            }
        }


    }
}
