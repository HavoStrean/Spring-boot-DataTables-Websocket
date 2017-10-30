package hello;

import java.time.LocalDate;
import java.util.Locale;
import sun.util.resources.LocaleData;

public class HelloMessage {

    private String name;
    private String date;
    public HelloMessage() {
    }

    public HelloMessage(String name) {

        this.date = LocalDate.now().toString();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
