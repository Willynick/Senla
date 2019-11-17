package task2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter two integer number: ");
        Scanner in = new Scanner(System.in);
        try {
            int number1 = in.nextInt();
            int number2 = in.nextInt();

            System.out.println("Greatest Common Divisor: " + MathFunctions.gcd(Math.abs(number1), Math.abs(number2)));
            System.out.println("Least Common Multiple: " + MathFunctions.lcm(number1, number2));
        }
        catch(Exception ex){
            System.out.print("You did not enter an integer number(s)");
        }
        in.close();
    }
}
