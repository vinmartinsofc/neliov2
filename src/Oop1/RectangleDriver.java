package Oop1;
import java.util.Scanner;

public class RectangleDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width and height: ");
        rectangle.setWidth(scanner.nextDouble());
        rectangle.setHeight(scanner.nextDouble());
        rectangle.showInfo();


        scanner.close();
    }
}
