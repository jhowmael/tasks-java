
/**
 * Create an implementation of a Rest API client.
 * Prints out how many records exists for each gender and save this file to s3 bucket
 * API endpoint=> https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda 
 * AWS s3 bucket => interview-digiage
 *
 */

 package com.example;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.net.HttpURLConnection;
 import java.net.URL;
 
 public class Task4 {
 
    public static void main(String[] args) {
        try {
            URL url = new URL("https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            String jsonResponse = response.toString();

            int countMale = 0;
            int countFemale = 0;
            String[] records = jsonResponse.split("\\},\\s*\\{"); 

            for (String record : records) {
                if (record.contains("\"gender\": \"M\"")) {
                    countMale++;
                } else if (record.contains("\"gender\": \"F\"")) {
                    countFemale++;
                }
            }
 
            System.out.println("Number of records with gender = M: " + countMale);
            System.out.println("Number of record with gender = F: " + countFemale);
 
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
 }
 