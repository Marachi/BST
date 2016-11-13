package tasks.task2.ent;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class WikiArticle implements SomeText{

    private String link;
    private String title;
    private String text;

    public WikiArticle() {
    }

    public WikiArticle(String link, String title, String text) {
        this.link = link;
        this.title = title;
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
