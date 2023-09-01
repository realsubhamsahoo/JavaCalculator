import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + Calculator.add(num1, num2));
        System.out.println("Difference: " + Calculator.subtract(num1, num2));
        System.out.println("Product: " + Calculator.multiply(num1, num2));

        try {
            System.out.println("Quotient: " + Calculator.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
