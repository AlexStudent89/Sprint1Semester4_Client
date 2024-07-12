package com.keyin.Sprint1Semester4_Client.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class AircraftService {
    public void addAircraft(Aircraft aircraft) {
        try {
            URL url = new URL("http://localhost:8080/aircraft");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            String jsonInputString = String.format(
                "{\"id\":%d,\"type\":\"%s\",\"airlineName\":\"%s\",\"numberOfPassengers\":%d}",
                aircraft.getId(), aircraft.getType(), aircraft.getAirlineName(), aircraft.getNumberOfPassengers()
            );

            try (var os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            System.out.println("POST Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Aircraft added successfully.");
            } else {
                System.out.println("POST request not worked.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
