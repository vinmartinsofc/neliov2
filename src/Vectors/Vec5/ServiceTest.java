package Vectors.Vec5;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceTest {
    public static void main(String[] args) {
        Room[] rooms = new Room[10];
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int n = 1 + secureRandom.nextInt(10);
        System.out.println("Rooms rented " + n);

            for (int i = 0; i < n; i++) {
                System.out.print("Name? ");
                String name = scanner.nextLine();
                System.out.print("Email? ");
                String email = scanner.nextLine();
                System.out.println("Room? ");
                int room = Integer.parseInt(scanner.nextLine());
                rooms[i] = new Room(name, email, room);
            }



        for (Room users : rooms) {

            if (users != null) {
                System.out.printf("Room Nº %d occupied by %n%s%n%s%n ====== NEXT ====== %n", users.room(), users.name(), users.email());
            }

        }


    }
}
