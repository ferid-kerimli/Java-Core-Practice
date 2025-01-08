package week11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String data = "This is a demo for java streams";
        String filename = "data.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(filename)) {
            byte[] bytes = data.getBytes();
            fileOutputStream.write(bytes);
            System.out.println("Data written to file: " + filename);
        } catch (IOException ex) {
            System.err.println("Error writing to file: " + ex.getMessage());
        }

        checkFileContent(filename);
        readFromFile(filename);
    }

    private static void checkFileContent(String filename) {
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            int content;
            System.out.println("Content of the file:");
            while ((content = fileInputStream.read()) != -1) {
                System.out.println((char) content);
            }
            System.out.println();
        } catch (IOException ex) {
            System.err.println("Error reading file content: " + ex.getMessage());
        }
    }

    private static void readFromFile(String filename) {
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            byte[] buffer = new byte[1024];
            StringBuilder sb = new StringBuilder();
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                sb.append(new String(buffer, 0, bytesRead));
            }
            System.out.println("Content read from file with (read(byte[])) method:");
            System.out.println(sb.toString());
        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
    }
}
