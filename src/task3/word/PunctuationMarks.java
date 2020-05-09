package task3.word;

public class PunctuationMarks {
    private String before;
    private String after;

    public PunctuationMarks() {

    }

    public PunctuationMarks(String before, String after) {
        this.before = before;
        this.after = after;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

}
