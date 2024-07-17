//Main
package com.keyin.http.cli;

import com.keyin.http.client.RESTClient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RESTClient restClient = new RESTClient();
        restClient.setServerURL("http://localhost:8080");

        HTTPRestCLIApplication app = new HTTPRestCLIApplication();
        app.setRestClient(restClient);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. List all airports");
            System.out.println("2. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(app.generateAirportReport());
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}