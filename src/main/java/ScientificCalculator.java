import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;

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
                    if (number >= 0) {
                        System.out.println("Square Root: " + Math.sqrt(number));
                    } else {
                        System.out.println("Error: Cannot compute square root of a negative number.");
                    }
                    break;

                case "2":
                    System.out.print("Enter a non-negative integer: ");
                    int n = scanner.nextInt();
                    if (n < 0) {
                        System.out.println("Error: Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println("Factorial: " + factorial(n));
                    }
                    break;

                case "3":
                    System.out.print("Enter a positive number: ");
                    double logNumber = scanner.nextDouble();
                    if (logNumber > 0) {
                        System.out.println("Natural Logarithm: " + Math.log(logNumber));
                    } else {
                        System.out.println("Error: Logarithm is not defined for non-positive numbers.");
                    }
                    break;

                case "4":
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Power: " + Math.pow(base, exponent));
                    break;

                default:
                    System.out.println("Invalid operation. Please try again.");
            }
            scanner.nextLine(); // Clear the buffer
        }
    
        scanner.close();
        
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
