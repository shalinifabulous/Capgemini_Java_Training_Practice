import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Day18_FileHandling {

    public static void main(String[] args) {

        System.out.println("Day 18: File Handling Practice");

        try {
            // Writing to file
            FileWriter fw = new FileWriter("practice.txt");
            fw.write("Java File Handling Practice");
            fw.close();

            // Reading from file
            FileReader fr = new FileReader("practice.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("IO Exception occurred");
        }

        System.out.println("\nDay 18 Practice Completed");
    }
}