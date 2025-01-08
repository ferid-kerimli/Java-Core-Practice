package week11;

import java.io.File;

public class FileSystemTraversal {
    public static void PrintFileInfo(String path) {
        File file = new File(path);

        if (file.exists()) {
            System.out.println("File/Directory Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory? " + file.isDirectory());
            System.out.println("Is File? " + file.isFile());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("File does not exist");
        }
    }

    public static void traverseFile(String path) {
        File file = new File(path);

        if (file.exists()) {
            if (file.isFile()) {
                PrintFileInfo(path);
            } else if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        traverseFile(f.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("File does not exist");
        }
    }

    public static void main(String[] args) {
        String filePath = "include path";
        traverseFile(filePath);
    }
}
