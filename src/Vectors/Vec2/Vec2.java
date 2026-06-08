package Vectors.Vec2;

import java.util.Scanner;

public class Vec2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = Integer.parseInt(scanner.nextLine());
        int negativeCount = 0;

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Integers to add: ");
            int n2 = Integer.parseInt(scanner.nextLine());
            numbers[i] = n2;

            if (numbers[i] < 0) {
                negativeCount++;
            }
        }

        if (negativeCount > 0) {
            System.out.println("Negatives: ");
        } else {
            System.out.println("There's no negative integers...");
        }

        for (int intNumbers : numbers) {
            if (intNumbers < 0) {
                System.out.println(intNumbers);
            }
        }


    }
}
