package com.keyin.Sprint1Semester4_Client.client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Add City");
            System.out.println("2. Add Airport");
            System.out.println("3. Add Aircraft");
            System.out.println("4. Add Passenger");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add logic to add city
                    break;
                case 2:
                    // Add logic to add airport
                    break;
                case 3:
                    // Add logic to add aircraft
                    break;
                case 4:
                    // Add logic to add passenger
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
