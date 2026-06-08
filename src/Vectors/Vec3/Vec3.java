package Vectors.Vec3;

import java.util.Scanner;

public class Vec3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people;

        System.out.print("Enter N: ");
        int n = Integer.parseInt(scanner.nextLine());
        people = new Person[n];

        for (int i = 0; i < people.length; i++) {

            System.out.println("Enter the name: ");
            String name = scanner.nextLine();

            System.out.print("age?: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("height?: ");
            double height = Double.parseDouble(scanner.nextLine());

            people[i] = (new Person(name, age, height));
        }

        int totalSixteen = 0;
        double totalHeight = 0;

        for (Person person : people) {
            totalHeight += person.getHeight();

            if (person.getAge() < 16) {
                totalSixteen++;
            }
        }

        System.out.printf("Height Average: %.2f%n", totalHeight / people.length);

        double percentage = totalSixteen * 100 / (double) n;

        System.out.printf("Under sixteen percentage: %.1f%%%n", percentage);


        for (Person names : people) {
            if (names.getAge() < 16) {
                System.out.println(names.getName());
            }
        }

        scanner.close();
    }


}



