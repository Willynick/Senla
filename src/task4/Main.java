package task4;
import java.util.Scanner;

public class Main {

    private static int GetCountWord(String text, String word){
        int count = 0;

        int index = text.indexOf(word);
        while (index != -1)
        {
            count++;
            index = text.indexOf(word, index + 1);
            if (index != -1 && (index + word.length() - 1) != text.length()-1 && index !=0 &&
                    (Character.isLetter(text.charAt(index+1))  || Character.isLetter(text.charAt(index-1)) )){
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = in.nextLine();

        System.out.print("Enter word: ");
        String word = in.next();

        System.out.print("The number of uses of the word in the text: " + GetCountWord(text.toLowerCase(), word.toLowerCase()));
        in.close();
    }
}
