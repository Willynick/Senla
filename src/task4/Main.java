package task4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static int GetCountWord(String text, String word){
        int count = 0;

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            count++;
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
