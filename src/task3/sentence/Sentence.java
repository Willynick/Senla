package task3.sentence;

import task3.util.SentenceUtility;
import task3.word.Word;

import java.util.ArrayList;
import java.util.Comparator;

public class Sentence {
    private String enteredSentence;

    private ArrayList<Word> words = new ArrayList<Word>();

    public Sentence(String enteredSentence) {
        this.enteredSentence = enteredSentence;

        this.Parse();
    }

    private void Parse() {
        String[] splitedWords = enteredSentence.split(" ");

        for (int i = 0; i < splitedWords.length; i++) {
            words.add(SentenceUtility.getWord(splitedWords[i]));
        }
    }

    public void setFirstLettersWordsToUppercase(){

        for(int i = 0; i < words.size(); i++){
            words.get(i).setWord(
                    Character.toUpperCase(words.get(i).getWord().charAt(0))
                            + words.get(i).getWord().substring(1)
            );
        }
    }

    public void sort()
    {
        words.sort(Comparator.comparing(Word::getWord, String.CASE_INSENSITIVE_ORDER));
    }

    public int calculateNumberOfWords()
    {
        return words.size();
    }

    public String toString(){
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sentence.append(words.get(i));
            if (i != (words.size() - 1)) {
                sentence.append(" ");
            }
        }

        return sentence.toString();
    }

}
