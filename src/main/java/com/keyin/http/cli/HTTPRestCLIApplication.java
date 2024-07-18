//HTTPRestCLIApplication.java
package com.keyin.http.cli;

import com.keyin.domain.Aircraft;
import com.keyin.domain.Airport;
import com.keyin.http.client.RESTClient;

import java.util.List;
import java.util.Scanner;

public class HTTPRestCLIApplication {

    private RESTClient restClient;

    public String generateAirportReport() {
        List<Airport> airports = getRestClient().getAllAirports();
        if (airports == null || airports.isEmpty()) {
            return "Error retrieving airport data";
        }

        StringBuilder report = new StringBuilder("Airport Report:\n");

        for (Airport airport : airports) {
            report.append("ID: ").append(airport.getId())
                    .append(", Name: ").append(airport.getName())
                    .append(", Code: ").append(airport.getCode())
                    .append("\n");
        }

        System.out.println(report.toString());
        return report.toString();
    }

    public String generateAircraftReport() {
        List<Aircraft> aircrafts = getRestClient().getAllAircraft();
        if (aircrafts == null || aircrafts.isEmpty()) {
            return "Error retrieving aircraft data";
        }

        StringBuilder report = new StringBuilder("Aircraft Report:\n");

        for (Aircraft aircraft : aircrafts) {
            report.append("ID: ").append(aircraft.getId())
                    .append(", type: ").append(aircraft.getType())
                    .append(", airlineName: ").append(aircraft.getAirlineName())
                    .append(", numberOfPassengers: ").append(aircraft.getNumberOfPassengers())
                    .append(", listOfAllowedAirports: ").append(aircraft.getListOfAllowedAirports())
                    .append("\n");
        }

        System.out.println(report.toString());
        return report.toString();
    }

    private void listGreetings() {
        System.out.println(getRestClient().getResponseFromHTTPRequest());
    }

    public RESTClient getRestClient() {
        if (restClient == null) {
            restClient = new RESTClient();
        }
        return restClient;
    }

    public void setRestClient(RESTClient restClient) {
        this.restClient = restClient;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter server URL: ");
        String serverURL = "http://localhost:8080";

        HTTPRestCLIApplication cliApp = new HTTPRestCLIApplication();

        if (serverURL != null && !serverURL.isEmpty()) {
            RESTClient restClient = new RESTClient();
            restClient.setServerURL(serverURL);
            cliApp.setRestClient(restClient);

            boolean running = true;

            while (running) {
                System.out.println("Choose an option:");
                System.out.println("1. List all airports");
                System.out.println("2. List all aircrafts");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        cliApp.generateAirportReport();
                        break;
                    case 2:
                        cliApp.generateAircraftReport();
                    case 3:
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Server URL cannot be empty.");
        }

        scanner.close();
    }
}