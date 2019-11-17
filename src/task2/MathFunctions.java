package task2;

public class MathFunctions {
    public static int gcd(int number1, int number2){

        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }

    public static int lcm(int number1, int number2){

        return number1 * number2 / gcd(Math.abs(number1), Math.abs(number2));
    }
}
