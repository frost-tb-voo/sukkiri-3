package sukkiri_3.ch05;

import java.util.Formatter;
import java.util.Locale;

public class Training05_01 {
    public static void main(String[] args) {
        new Training05_01().introduceOneSelf();
    }

    public void introduceOneSelf() {
        String name = "name";
        int age = 99;
        int height = 999;
        char eto = '子';
        StringBuilder sb = new StringBuilder();
        try (Formatter formatter = new Formatter(sb, Locale.US)) {
            formatter.format("%1$2s と申します, %2$2s 歳, 身長 %3$2s cm, %4$2s 年です.", name, age, height, eto);
            System.out.println(sb);
        }
    }

}