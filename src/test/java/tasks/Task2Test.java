package tasks;

import org.junit.Test;
import tasks.task2.counter.Counter;
import tasks.task2.counter.CustomCounter;
import tasks.task2.ent.Article;
import tasks.task2.ent.SomeText;

import static org.junit.Assert.*;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class Task2Test {

    @Test
    public void countTest() throws Exception {
        Article article = new Article();
        article.setText("test sdtestasd test as dasd asd test");
        article.setTitle("test sdtestasd test as dasd asd test");
        Counter counter = new CustomCounter();
        assertEquals(counter.count(article,"test"),8);
        System.out.println("asdasd"+null);

    }

}