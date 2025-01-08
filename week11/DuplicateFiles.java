package week11;

import java.io.*;

public class DuplicateFiles {
    public static void main(String[] args) {
        String originalFilePath = "";
        String duplicateFilePath = "";

        try (FileInputStream fileInputStream = new FileInputStream(originalFilePath);
             FileOutputStream fileOutputStream = new FileOutputStream(duplicateFilePath)) {

            int byteRead;

            while ((byteRead = fileInputStream.read()) != -1) {
                fileOutputStream.write(byteRead);
            }
            System.out.println("File duplicated successfully");;
        } catch (IOException ex) {
            System.err.println("Error duplicating file: " + ex.getMessage());
        }

        // Checking if the new file is the same as the original
        boolean filesMatch = compareFiles(originalFilePath, duplicateFilePath);
        if (filesMatch) {
            System.out.println("Success");;
        } else {
            System.out.println("error");
        }
    }

    private static boolean compareFiles(String file1, String file2) {
        try (FileInputStream fileInputStream1 = new FileInputStream(file1);
             FileInputStream fileInputStream2 = new FileInputStream(file2)) {

            int byteRead1;
            int byteRead2;

            while ((byteRead1 = fileInputStream1.read()) != -1 && (byteRead2 = fileInputStream2.read()) != -1) {
                if (byteRead1 != byteRead2) {
                    return false; // Because files are different
                }
            }
            return true; // Files are identical if both reach EOF at the same time
        } catch (IOException ex) {
            System.err.println("Error comparing files: " + ex.getMessage());
            return false; // Error occurred during file comparison
        }
    }
}
