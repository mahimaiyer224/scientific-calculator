import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        //Test Comment
        System.out.println("Welcome to the Simple Scientific Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Square Root (sqrt)");
        System.out.println("2. Factorial (factorial)");
        System.out.println("3. Natural Logarithm (log)");
        System.out.println("4. Power (power)");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("Enter operation: ");
            operation = scanner.nextLine().trim();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            switch (operation) {
                case "1":
                    System.out.print("Enter a non-negative number: ");
                    double number = scanner.nextDouble();
                    try {
                        System.out.println("Square Root: " + sqrt(number));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "2":
                    System.out.print("Enter a non-negative integer: ");
                    int n = scanner.nextInt();
                    try {
                        System.out.println("Factorial: " + factorial(n));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "3":
                    System.out.print("Enter a positive number: ");
                    double logNumber = scanner.nextDouble();
                    try {
                        System.out.println("Natural Logarithm: " + log(logNumber));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "4":
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power: " + power(base, exponent));
                    break;

                default:
                    System.out.println("Invalid operation. Please try again.");
            }
            scanner.nextLine(); // Clear the buffer
        }

        scanner.close();
    }

    public static double sqrt(double number) {
        if (number < 0) throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        return Math.sqrt(number);
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double log(double number) {
        if (number <= 0) throw new IllegalArgumentException("Logarithm is not defined for non-positive numbers.");
        return Math.log(number);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
