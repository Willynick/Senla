package task3.util;

import task3.word.PunctuationMarks;
import task3.word.Word;

public class SentenceUtility {

    public static Word getWord(String word)
    {
        StringBuilder resultWord = new StringBuilder();
        StringBuilder punctuationMarksBefore = new StringBuilder();
        StringBuilder punctuationMarksAfter = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                resultWord.append(word.charAt(i));
            } else {
                if (i <= word.length()/2) {
                    punctuationMarksBefore.append(word.charAt(i));
                } else {
                    punctuationMarksAfter.append(word.charAt(i));
                }
            }
        }

        return new Word(
                resultWord.toString(),
                new PunctuationMarks(punctuationMarksBefore.toString(), punctuationMarksAfter.toString())
        );
    }

}
