package task3;
import task3.sentence.Sentence;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the sentence: ");
        Scanner in = new Scanner(System.in);
        String enteredSentence = in.nextLine();

        Sentence sentence = new Sentence(enteredSentence);

        sentence.sort();
        sentence.setFirstLettersWordsToUppercase();

        System.out.println("Number of words in the sentence: " + sentence.calculateNumberOfWords());
        System.out.println("New sentence: ");
        System.out.print(sentence.toString());

        in.close();
    }
}
