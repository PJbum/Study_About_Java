package org.example;
import java.util.Scanner;
public class DivisionCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    try{
        System.out.print("Enter the first number: ");
        String input1 = scanner.nextLine();
        int num1 = Integer.parseInt(input1);
        System.out.print("Enter the second number: ");
        String input2 = scanner.nextLine();
        int num2 = Integer.parseInt(input2);
        int result = num1/num2;
        System.out.println("Result: "+result);
    }
    catch(NumberFormatException e){
        System.out.println("Invalid input!");
    }
    catch(ArithmeticException e){
        System.out.println("Cannot using zero");
    }
    finally{
        scanner.close();
    }
}
}