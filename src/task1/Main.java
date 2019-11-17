package task1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the integer number: ");
        Scanner in = new Scanner(System.in);
        try {
            int number = in.nextInt();

            System.out.print("This number is ");
            if (NumberCharacteristics.IsEven(number)) {
                System.out.print("even");
            }
            else {
                System.out.print("odd");
            }

            System.out.print(" and ");
            if (NumberCharacteristics.IsComposite(number)) {
                System.out.print("composite");
            }
            else {
                System.out.print("prime");
            }
        }
        catch(Exception ex){
            System.out.print("You did not enter an integer number");
        }
        in.close();
    }
}
