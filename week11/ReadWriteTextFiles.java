package week11;

import java.io.*;

public class ReadWriteTextFiles {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("sample.txt")) {
            fileWriter.write("Example for using FileWriter");
        } catch (IOException ex) {
            System.err.println("Error while writing to file: " + ex.getMessage());
        }

        // Reading from file with FileReader
        try (FileReader fileReader = new FileReader("sample.txt")) {
            int character;
            StringBuilder content = new StringBuilder();
            while ((character = fileReader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("Content read using read()");
            System.out.println(content.toString());
        } catch (IOException ex) {
            System.err.println("Error reading from file: " + ex.getMessage());
        }

        // Reading with read(char[]) method
        try (FileReader fileReader = new FileReader("sample.txt")) {
            char[] buffer = new char[1024];
            StringBuilder content = new StringBuilder();
            int charsRead;
            while ((charsRead = fileReader.read(buffer)) != -1) {
                content.append(buffer, 0, charsRead);
            }
            System.out.println("Content read using read(char[]) method");
            System.out.println(content.toString());
        } catch (IOException ex) {
            System.err.println("Error reading from file: " + ex.getMessage());
        }
    }
}
