package Vectors.Vec3;

import java.util.Arrays;
import java.util.Scanner;

public class Vec3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        People[] people;

        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        people = new People[n];

        while (n != 0) {

            System.out.println("Enter the name: ");
            String name = scanner.nextLine();

            System.out.println("age? ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("height? ");
            double height = Double.parseDouble(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                people[i] = (new People(name, age, height));
            }

            n--;
        }


        int totalSixteen = 0;
        double totalHeight = 0;
        double underSixteenAgeSum = 0;

        for (People ppl : people) {
            totalHeight += ppl.getHeight();
        }

        System.out.printf("Height Average: %.2f%n", totalHeight / people.length);

        for (People pplAge : people) {
            if (pplAge.getAge() < 16) {
                totalSixteen++;
                underSixteenAgeSum += pplAge.getAge();
            }

        }

        if (totalSixteen == 0) {
            System.out.printf("%s%n","There's nobody under sixteen");
        } else {
            System.out.printf("Under sixteen percentage: %.1f%%%n", underSixteenAgeSum / totalSixteen);
        }

        for (People underSixteen : people) {
            if (underSixteen.getAge() < 16) {
                System.out.println(underSixteen.getName());
            }
        }



    }


}



