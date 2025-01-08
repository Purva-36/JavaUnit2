package Unit2;
import java.util.Scanner;
 public class Calculator {

        // Method to add two numbers
        public int calculate(int a, int b) {
            return a + b;
        }

        // Method to add three numbers
        public int calculate(int a, int b, int c) {
            return a + b + c;
        }

        // Method to multiply two numbers
        public double calculate(double a, double b) {
            return a * b;
        }

        // Method to subtract two numbers
        public int calculate(int a, int b, boolean isSubtraction) {
            if (isSubtraction) {
                return a - b;
            } else {
                return calculate(a, b); // Calls addition method
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculator calc = new Calculator();
            int choice;

            do {
                System.out.println("\n--- Calculator Menu ---");
                System.out.println("1. Addition of two numbers");
                System.out.println("2. Addition of three numbers");
                System.out.println("3. Multiplication of two numbers");
                System.out.println("4. Subtraction of two numbers");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        int a1 = scanner.nextInt();
                        System.out.print("Enter second number: ");
                        int b1 = scanner.nextInt();
                        System.out.println("Result: " + calc.calculate(a1, b1));
                        break;

                    case 2:
                        System.out.print("Enter first number: ");
                        int a2 = scanner.nextInt();
                        System.out.print("Enter second number: ");
                        int b2 = scanner.nextInt();
                        System.out.print("Enter third number: ");
                        int c2 = scanner.nextInt();
                        System.out.println("Result: " + calc.calculate(a2, b2, c2));
                        break;

                    case 3:
                        System.out.print("Enter first number: ");
                        double a3 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b3 = scanner.nextDouble();
                        System.out.println("Result: " + calc.calculate(a3, b3));
                        break;

                    case 4:
                        System.out.print("Enter first number: ");
                        int a4 = scanner.nextInt();
                        System.out.print("Enter second number: ");
                        int b4 = scanner.nextInt();
                        System.out.println("Result: " + calc.calculate(a4, b4, true));
                        break;

                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 5);

            scanner.close();
        }
    }

