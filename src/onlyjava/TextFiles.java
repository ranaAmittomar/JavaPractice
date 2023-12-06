package onlyjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFiles {

    public static void readingTheFile() {

        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {

            System.out.println(reader.readLine()); // we're reading the first line from the file.

            // to read every single line..follow the below loop.
            String line; // it'll store the every line while we iterate over string in file.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); // t's important and good practice to close the reader object.

        } catch (IOException e) {

            System.out.println("Cannot read the file content");
            e.printStackTrace();
        }

    }

    public static void writingTheFile() { // method to write inside a txt file.
        String[] names = { "Amit", "Shweta", "Meena", "Tomar" };
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Writing from the java class"); // it'll write inside the txt file.
            writer.write("\nThis is another line.");
            writer.write("This is in the same line");
            // for automatic addition.. we'll loop through names to add that in lines.
            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close(); // it's important and good practice to close the writer object.
        } catch (IOException e) {
            System.out.println("Unable to create the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writingTheFile();
        readingTheFile();
    }
}
