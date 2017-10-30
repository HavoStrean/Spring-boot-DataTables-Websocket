package hello;

import java.time.LocalDate;

public class Greeting {

    private String content;
    private String date;

    public Greeting(String content) {
        this.date = LocalDate.now().toString();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
