package readingdatafromweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class ReadingDataFromWeb {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://eiasinprodhan.github.io");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                String result = "";
                PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\eioason.html");
                while ((line = reader.readLine()) != null) {
                    result += line;
                }
                pw.println(result);
                pw.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
