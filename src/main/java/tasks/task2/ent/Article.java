package tasks.task2.ent;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class Article implements SomeText{
    private String author;
    private String title;
    private String journal;
    private int year;
    private String text;

    public Article() {
    }

    public Article(String author, String title, String journal, int year, String text) {
        this.author = author;
        this.title = title;
        this.journal = journal;
        this.year = year;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
