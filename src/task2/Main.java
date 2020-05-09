package task2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in;
        boolean isNumbersCorrect = true;

        do {
            in = new Scanner(System.in);
            try {
                System.out.print("Enter first integer number: ");
                int number1 = in.nextInt();
                System.out.print("Enter second integer number: ");
                int number2 = in.nextInt();

                System.out.println("Greatest Common Divisor: " + MathFunctions.gcd(Math.abs(number1), Math.abs(number2)));
                System.out.println("Least Common Multiple: " + MathFunctions.lcm(number1, number2));

                isNumbersCorrect = true;

            } catch (InputMismatchException ex) {
                System.out.print("You did not enter an integer number.\nPlease, repeat operation again\n");

                isNumbersCorrect = false;
            } catch (Exception ex)
            {
                System.out.print("There are some unexpected errors.\nPlease, repeat operation again\n");

                isNumbersCorrect = false;
            }
        }
        while (!isNumbersCorrect);

        in.close();
    }
}
