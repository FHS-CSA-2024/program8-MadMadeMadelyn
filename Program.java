import java.util.Scanner;
public class Program8 {
    public static void main(String[]args){
        int num1 = 0;
        int num2 = 0;
        
        Scanner numOneScanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = numOneScanner.nextInt();
        
        Scanner numTwoScanner = new Scanner(System.in);
        System.out.println("Enter number 2: ");
        num2 = numTwoScanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = sum / 2.0;
        int absoluteValue = Math.abs(difference);
        int maximum = (absoluteValue + num1 + num2) / 2;
        int minimum = (num1 + num2 - absoluteValue) / 2;
        
        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        System.out.println("Absolute value = " + absoluteValue);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);
    }
}
