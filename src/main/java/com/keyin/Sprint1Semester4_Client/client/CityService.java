package com.keyin.Sprint1Semester4_Client.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class CityService {
    public void addCity(City city) {
        try {
            URL url = new URL("http://localhost:8080/city");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            String jsonInputString = String.format(
                "{\"id\":%d,\"name\":\"%s\",\"state\":\"%s\",\"population\":%d}",
                city.getId(), city.getName(), city.getState(), city.getPopulation()
            );

            try (var os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            System.out.println("POST Response Code :: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("City added successfully.");
            } else {
                System.out.println("POST request not worked.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
