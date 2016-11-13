package tasks.task2.ent;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class BookDescription implements SomeText{

    private String author;
    private String title;
    private String publisher;
    private String annotation;
    private String text;

    public BookDescription() {
    }

    public BookDescription(String author, String title, String publisher, String annotation, String text) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.annotation = annotation;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
