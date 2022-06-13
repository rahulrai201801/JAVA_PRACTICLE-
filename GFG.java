//ques 23

// Importing required classes
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class
// URLConnectionclass
class GFG {
    // main driver method
    public static void main(String[] args) {

        // Try block to check for exceptions
        try {

            // Fetching URL by creating
            URL url = new URL(
                    "https://www.google.com");

            // Opening the connection to the above URL
            URLConnection urlcon = url.openConnection();

            // To get a map of all the fields of http header
            Map<String, List<String>> header = urlcon.getHeaderFields();

            // Printing all the fields along with their
            // value
            for (Map.Entry<String, List<String>> mp : header.entrySet()) {
                System.out.print(mp.getKey() + " : ");
                System.out.println(
                        mp.getValue().toString());
            }

            System.out.println();
            System.out.println(
                    "Complete source code of the URL is-");
            System.out.println(
                    "---------------------------------");

            // Getting the inputstream of the open
            // connection
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    urlcon.getInputStream()));
            String i;

            // Printing the source code line by line
            while ((i = br.readLine()) != null) {

                System.out.println(i);
            }
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Displaying exceptions
            System.out.println(e);
        }
    }
}