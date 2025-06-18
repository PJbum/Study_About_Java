package lab8;

import java.io.File;
import java.util.Scanner;

public class SimpleFileCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("filename: ");
        String filename = scanner.nextLine();
        File file = new File(filename);
        try {
            if (file.exists()) {
                System.out.println("File found successfully!");
            }
            else {
                throw new Exception("File not found!");
            }
        }
        catch (Exception e) {
            System.out.println("error: " + e.getMessage());

        }
        finally {
            scanner.close();
            System.out.println("closed.");
        }
    }
}
