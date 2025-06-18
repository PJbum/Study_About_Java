import java.util.Scanner;

public class Main1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        String age = scanner.nextLine();
        System.out.print("Major: ");
        String major = scanner.nextLine();
        System.out.print("Country: ");
        String country = scanner.nextLine();
        scanner.close();

        System.out.println();
        System.out.rpintf("Name: %-15s%n", name);
        System.out.rpintf("Age: %-15s%n", age);
        System.out.rpintf("Major: %-15s%n", major);
        System.out.rpintf("Country: %-15s%n", country);
    }
}
