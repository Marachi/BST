package tasks.task2.counter;

import tasks.task2.ent.SomeText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Potaychuk on 12.11.2016.
 */
public class CustomCounter implements Counter {

    public int count(SomeText someText, String keyWord) {
        int temp = 0;
        StringBuffer sb = new StringBuffer();
        if (someText.getText() != null) {
           sb.append(someText.getText());
        }
        if (someText.getTitle() != null){
            sb.append(someText.getTitle());
        }
        Matcher matcher = Pattern.compile(keyWord).matcher(sb);
        while (matcher.find()) {
            temp++;
        }
        return temp;
    }
}
