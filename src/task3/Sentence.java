package task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private ArrayList<Word> words = new ArrayList<Word>();

    public void Parse(String sentence){
        String[] tmpWords = sentence.split(" ");

        char[] punctMarks= {'?', '!', '.', ','};

        for (int i = 0; i < tmpWords.length; i++){
            if (!Character.isLetter(tmpWords[i].charAt(tmpWords[i].length()-1))){
                int start = -1;

                for (int j = 0; j < 4; j++){
                    start = tmpWords[i].indexOf(punctMarks[j]);
                    if (start != -1){
                        break;
                    }
                }

                words.add(new Word(tmpWords[i].substring(0, (start)), tmpWords[i].substring(start)));
            }
            else{
                words.add(new Word(tmpWords[i], ""));
            }
        }
    }

    public int Lenght(){
        return words.size();
    }

    public void ConvertionTheFirstLetterOfSentenceToUppercase(){

        for(int i = 0; i < words.size(); i++){
            words.get(i).setWord(Character.toUpperCase(words.get(i).getWord().charAt(0)) + words.get(i).getWord().substring(1));
        }
    }

    public void SortWords(){
        words.sort(Comparator.comparing(Word::getWord, String.CASE_INSENSITIVE_ORDER));
    }

    public void SetPunctuationMarksInNormalOrder(){
        for (int i = 0; i < words.size(); i++){
            if (!words.get(i).getPunctuationMarks().equals(',') && words.get(i).getPunctuationMarks() != "" && i != (words.size() - 1)){
                String tmp = words.get(words.size() - 1).getPunctuationMarks();
                words.get(words.size() - 1).setPunctuationMarks(words.get(i).getPunctuationMarks());
                words.get(i).setPunctuationMarks(tmp);
            }
            else if (i == (words.size() - 1) && words.get(i).getPunctuationMarks() == ","){
                words.get(i).setPunctuationMarks("");
            }
        }
    }

    public String toString(){
        String sentence = "";
        for (int i = 0; i < words.size(); i++) {
            sentence += words.get(i).toString();
            if (i != (words.size() - 1)) {
                sentence += " ";
            }
        }
        return sentence;
    }

}
