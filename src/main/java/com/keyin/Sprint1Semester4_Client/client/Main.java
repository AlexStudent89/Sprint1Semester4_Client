package com.keyin.Sprint1Semester4_Client.client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CityService cityService = new CityService();
        PassengerService passengerService = new PassengerService();
        AircraftService aircraftService = new AircraftService();
        AirportService airportService = new AirportService();

        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. List airports in a city");
            System.out.println("2. List aircraft for a passenger");
            System.out.println("3. List airports for an aircraft");
            System.out.println("4. List airports for a passenger");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter city index: ");
                    int cityIndex = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    listAirportsInCity(cityIndex, cityService);
                    break;
                case 2:
                    System.out.print("Enter passenger ID: ");
                    long passengerId = scanner.nextLong();
                    scanner.nextLine();  // Consume newline
                    listAircraftForPassenger(passengerId, passengerService);
                    break;
                case 3:
                    System.out.print("Enter aircraft ID: ");
                    long aircraftId = scanner.nextLong();
                    scanner.nextLine();  // Consume newline
                    listAirportsForAircraft(aircraftId, aircraftService);
                    break;
                case 4:
                    System.out.print("Enter passenger ID: ");
                    long passengerIdForAirports = scanner.nextLong();
                    scanner.nextLine();  // Consume newline
                    listAirportsForPassenger(passengerIdForAirports, passengerService);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }

        scanner.close();
    }

    private static void listAirportsInCity(int cityIndex, CityService cityService) {
        // Implement logic to list airports in the specified city
        System.out.println("Listing airports in city with index: " + cityIndex);
        // Call the cityService to get the list of airports for the specified city
    }

    private static void listAircraftForPassenger(long passengerId, PassengerService passengerService) {
        // Implement logic to list aircraft for the specified passenger
        System.out.println("Listing aircraft for passenger with ID: " + passengerId);
        // Call the passengerService to get the list of aircraft for the specified passenger
    }

    private static void listAirportsForAircraft(long aircraftId, AircraftService aircraftService) {
        // Implement logic to list airports for the specified aircraft
        System.out.println("Listing airports for aircraft with ID: " + aircraftId);
        // Call the aircraftService to get the list of airports for the specified aircraft
    }

    private static void listAirportsForPassenger(long passengerIdForAirports, PassengerService passengerService) {
        // Implement logic to list airports for the specified passenger
        System.out.println("Listing airports for passenger with ID: " + passengerIdForAirports);
        // Call the passengerService to get the list of airports for the specified passenger
    }
}