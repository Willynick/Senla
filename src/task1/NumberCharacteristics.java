package task1;

public class NumberCharacteristics {
    public static boolean IsEven(int number){

        return number % 2 == 0;
    }

    public static boolean IsComposite(int number){
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0)
            {
                return true;
            }
        }
        return false;
    }
}
