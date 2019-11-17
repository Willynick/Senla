package task3;

public class Word {
    private String word;
    private String punctuationMarks;

    public String getWord(){
        return word;
    }
    public void setWord(String word){
        this.word = word;
    }

    public String getPunctuationMarks(){
        return punctuationMarks;
    }
    public void setPunctuationMarks(String punctuationMarks){
        this.punctuationMarks = punctuationMarks;
    }

    public Word(String word, String punctuationMarks){
        this.word = word;
        this.punctuationMarks = punctuationMarks;
    }

    public String toString(){

        return (getWord() + getPunctuationMarks());
    }
}
