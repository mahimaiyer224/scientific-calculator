import java.util.Scanner;

public class sc {

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        long res = 1;
        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        return res;
    }

    public static double naturalLog(double x) {
        if (x <= 0) throw new IllegalArgumentException("Natural Logarithm is not defined for non-positive numbers");
        return Math.log(x);
    }

    public static double power(double b, double e) {
        return Math.pow(b, e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        System.out.println("1. Square Root of a number");
        System.out.println("2. Factorial of a number");
        System.out.println("3. Natural log of a number");
        System.out.println("4. Power");
        System.out.println("Select your choice from 1 to 4");

        double result = 0;
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter your number:");
                double num1 = sc.nextDouble();
                result = squareRoot(num1);
                break;
            case 2:
                System.out.println("Enter your number:");
                int num2 = sc.nextInt();
                result = factorial(num2);
                break;
            case 3:
                System.out.println("Enter your number:");
                double num3 = sc.nextDouble();
                result = naturalLog(num3);
                break;
            case 4:
                System.out.println("Enter the base:");
                double base = sc.nextDouble();
                System.out.println("Enter the exponent:");
                double exponent = sc.nextDouble();
                result = power(base, exponent);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
