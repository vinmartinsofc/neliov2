package Oop3;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter the student first, second and third grades:");
        student.setGrade1(scanner.nextDouble());
        student.setGrade2(scanner.nextDouble());
        student.setGrade3(scanner.nextDouble());

        student.hasPassed();


        scanner.close();
    }
}
