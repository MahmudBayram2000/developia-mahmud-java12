package ExchangeMoney;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Main {
    public static void main(String[] args) {
        try {
            // Create a URL object with the desired URL
            URL url = new URL("https://cbar.az/currencies/05.03.2010.xml");

            // Open a connection to the URL
            URLConnection connection = url.openConnection(); BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine;
            StringBuilder response = new StringBuilder();
            // Read the response line by line
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            // Close the input stream
            in.close();

            // Print the response
            System.out.println(response.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

