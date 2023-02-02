package StrangerThings;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/*
Project: Lab 3
Purpose Details: NOAA Web Services
Course: IST 411
Author: Team 3
Date Developed: 1/31/2023
Last Date Changed: 1/31/2023
Revision: 1
 */
public class StrangerThings {

    public static void main(String[] args) {

        Gson gson = new Gson();
        String response;
        HttpURLConnection connection = null;

        try {
            URL url = new URL("https://api.tvmaze.com/seasons/100928/episodes");
            connection = (HttpURLConnection) url.openConnection();

            InputStreamReader inputStreamRead = new InputStreamReader(connection.getInputStream());
            BufferedReader buffRead = new BufferedReader(inputStreamRead);
            response = buffRead.readLine();

            Results[] resList = gson.fromJson(response, Results[].class);

            System.out.println("Stranger Things Season 4");
            System.out.println("Episode Guide");
            System.out.println();

            for (Results resList1 : resList) {

                System.out.printf("%-15s%s\n", "Name", resList1.getName());
                System.out.printf("%-15s%s\n", "Ep #", resList1.getNumber());
                System.out.printf("%-15s%s\n", "Aired", resList1.getAirdate());
                System.out.printf("%-15s%s\n", "Runtime", resList1.getRuntime());
                System.out.printf("%-15s%s\n", "Rating", resList1.getRating().getAverage());
                
                String edit1 = resList1.getSummary().replace("<p>", "");
                String edit2 = edit1.replace("</p>", "");
                
                System.out.printf("%-15s%s\n", "Summary", edit2);
                System.out.println();

            }

        }
        catch (IOException ex) {
            System.out.println(ex);
        } finally {
            connection.disconnect();
        }
    }

}
