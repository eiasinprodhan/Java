package readingdatafromweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class ReadingDataFromWeb {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Web Address: ");
        String userURL = scan.next();
        System.out.print("Enter File Name: ");
        String fileName = scan.next();
        try {
            URL url = new URL("https://" + userURL);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                String result = "";
                PrintWriter pw = new PrintWriter("C:\\Users\\black\\Desktop\\"+fileName+".html");
                while ((line = reader.readLine()) != null) {
                    result += line;
                }
                pw.println(result);
                System.out.println("File Created Successfully.");
                pw.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
