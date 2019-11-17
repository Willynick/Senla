package task3;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Character;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the sentence: ");
        Scanner in = new Scanner(System.in);
        String tmpSentence = in.nextLine();

        Sentence sentence = new Sentence();

        sentence.Parse(tmpSentence);
        sentence.SortWords();
        sentence.ConvertionTheFirstLetterOfSentenceToUppercase();
        sentence.SetPunctuationMarksInNormalOrder();

        System.out.println("Sentence count: " + sentence.Lenght());
        System.out.println("New sentence: ");
        System.out.print(sentence.toString());

        in.close();
    }
}
