package task5;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in;
        boolean isNumberCorrect = true;

        do {
            System.out.print("Enter the integer number N [from 0 to 100]: ");

            in = new Scanner(System.in);

            try {

                int n = in.nextInt();

                if (n < 0 || n > 100) {
                    throw new Exception("Number must be between 0 and 100");
                }

                System.out.print("All numbers-palindromes: ");
                System.out.print(Palindrome.getAllPalindromes(n));

                isNumberCorrect = true;
            } catch (Exception ex) {
                System.out.print(ex.getMessage() + "\nPlease, repeat operation again\n");

                isNumberCorrect = false;
            }
        }
        while (!isNumberCorrect);

        in.close();
    }
}
