package noaaproject;

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
Last Date Changed: 2/3/2023
Revision: 2
 */
public class Noaa {

    public static void main(String[] args) {
        //Key provided by signing up for access
        String accessToken = "bEEvYCuuoTTzcuyIotkYswwRfEcsuhxD";
        //Library that serializes and deserializes JSON
        Gson gson = new Gson();
        String response;
        HttpURLConnection connection = null;

        try {
            /*
            * Below is the url that is locked and needs a token to unlock.
            */
            URL url = new URL("https://www.ncdc.noaa.gov/cdo-web/api/v2/datasets");
            connection = (HttpURLConnection) url.openConnection();
            /*
            *Use our token to grant access to the data.
            */        
            connection.setRequestProperty("token", accessToken);
            //Typical gathering and storing of retrieved data
            InputStreamReader inputStreamRead = new InputStreamReader(connection.getInputStream());
            BufferedReader buffRead = new BufferedReader(inputStreamRead);
            response = buffRead.readLine();

            /*
            *Create a NoaaData object for the GSON to turn the JSON into objects.
            *It needs the data and the first class for the data to be converted
            *into, fed into the parameters of the fromJson method
             */
            NoaaData noaa = gson.fromJson(response, NoaaData.class);

            /*
            *The GSON examines the structure of the JSON and uses class objects to store components
            *of the JSON. In this case there are three: metadata, resultset, and results.
            *These are represented by the classes of the same names. Finally, the GSON stores individual
            *data points in each corresponding class based on the type and name of class variables
             */
            //Metadata data printout
            System.out.println("Result Set");
            System.out.println("----------");
            System.out.printf("%-15s%s\n", "Offset", noaa.getMetaData().getResultset().getOffset());
            System.out.printf("%-15s%s\n", "Count", noaa.getMetaData().getResultset().getCount());
            System.out.printf("%-15s%s\n", "Limit", noaa.getMetaData().getResultset().getLimit());
            System.out.println();

            //Results is the bulk of the data so it is stored in an array and then read out
            int count = 1;
            for (Results res : noaa.getResults()) {
                /*
                *Print out format used to read the data.
                */ 
                System.out.println("Result " + count++);
                System.out.println("---------");
                System.out.printf("%-15s%s\n", "Uid", res.getUid());
                System.out.printf("%-15s%s\n", "Min Date", res.getMindate());
                System.out.printf("%-15s%s\n", "Max Date", res.getMaxdate());
                System.out.printf("%-15s%s\n", "Name", res.getName());
                System.out.printf("%-15s%s\n", "Data Coverage", res.getDatacoverage());
                System.out.printf("%-15s%s\n", "ID", res.getId());
                System.out.println("");

            }

        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            connection.disconnect();
        }
    }

}
