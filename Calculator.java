import java.util.Scanner;

public class Calculator {
    private static MathOperation addition;
    private static MathOperation subtraction;
    private static MathOperation multiplication;
    private static MathOperation division;

    public static void main(String[] args) {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");

        while (true) {
            System.out.println("\nPlease choose an operation:");
            System.out.println("1. Addition (+) hugobuta | it gonna cause conflict");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for using the Calculator. Goodbye!");
                break;
            }

            System.out.println("Enter the left operand:");
            double leftOperand = scanner.nextDouble();

            System.out.println("Enter the right operand:");
            double rightOperand = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = addition.calculate(leftOperand, rightOperand);
                    break;
                case 2:
                    result = subtraction.calculate(leftOperand, rightOperand);
                    break;
                case 3:
                    result = multiplication.calculate(leftOperand, rightOperand);
                    break;
                case 4:
                    try {
                        result = division.calculate(leftOperand, rightOperand);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
