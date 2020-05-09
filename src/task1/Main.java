package task1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in;
        boolean isNumberCorrect = true;

        do {
            System.out.print("Enter the integer number: ");
            in = new Scanner(System.in);
            try {
                int number = in.nextInt();

                System.out.print("This number is ");

                if (NumberCharacteristics.IsEven(number)) {
                    System.out.print("even");
                } else {
                    System.out.print("odd");
                }

                System.out.print(" and ");
                if (NumberCharacteristics.IsComposite(number)) {
                    System.out.print("composite");
                } else {
                    System.out.print("prime");
                }

                isNumberCorrect = true;

            } catch (InputMismatchException ex) {
                System.out.print("You did not enter an integer number.\nPlease, repeat operation again\n");

                isNumberCorrect = false;
            } catch (Exception ex)
            {
                System.out.print("There are some unexpected errors.\nPlease, repeat operation again\n");

                isNumberCorrect = false;
            }
        }
        while (!isNumberCorrect);

        in.close();
    }
}
