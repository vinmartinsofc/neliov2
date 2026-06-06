package Vectors.Vec3;

import java.util.Scanner;

public class Vec3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        People[] people = null;

        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());

        while (n > 1) {

            System.out.println("Enter the name: ");
            String name = scanner.nextLine();

            System.out.println("age? ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("height? ");
            double height = Double.parseDouble(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                people = new People[n];
                people[i] = (new People(name, age, height));

            }

            n--;
        }

        assert people != null;

        for (People ppl : people) {
            int totalOfPeopleUnderSixteen = 0;
            double sixteenPercentage = 0;

            if (ppl.getAge() <= 16) {
                totalOfPeopleUnderSixteen++;
                sixteenPercentage = (double) ppl.getAge() / totalOfPeopleUnderSixteen;
            } else {
                System.out.println("There's nobody under sixteen");
            }


            double heightAvg = ppl.getHeight() / people.length;
            System.out.println("Height avg: " + heightAvg);

            if (totalOfPeopleUnderSixteen > 0) {
                System.out.println("Under Sixteen: " + sixteenPercentage);
            }


        }

    }


}
