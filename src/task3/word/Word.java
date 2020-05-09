package task3.word;

import java.util.Dictionary;
import java.util.Hashtable;

public class Word {
    private String word;
    private PunctuationMarks punctuationMarks = new PunctuationMarks();

    public String getWord(){
        return word;
    }
    public void setWord(String word){
        this.word = word;
    }

    public PunctuationMarks getPunctuationMarks() {
        return punctuationMarks;
    }

    public void setPunctuationMarks(PunctuationMarks punctuationMarks) {
        this.punctuationMarks = punctuationMarks;
    }

    public Word(String word, PunctuationMarks punctuationMarks) {
        this.word = word;
        this.punctuationMarks = punctuationMarks;
    }

    public String toString(){
        return punctuationMarks.getBefore() + word + punctuationMarks.getAfter();
    }
}
