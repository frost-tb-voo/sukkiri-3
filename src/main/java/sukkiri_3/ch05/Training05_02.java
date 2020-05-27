package sukkiri_3.ch05;

import java.util.Formatter;
import java.util.Locale;

public class Training05_02 {
    public static void main(String[] args) {
        String title = "title";
        String address = "a@example.com";
        String text = "content";
        new Training05_02().email(title, address, text);
    }

    public void email(String title, String address, String text) {
        StringBuilder sb = new StringBuilder();
        try (Formatter formatter = new Formatter(sb, Locale.US)) {
            formatter.format("%1$2s に、以下のメールを送信しました\n", address);
            formatter.format("件名：%1$2s\n", title);
            formatter.format("本文：%1$2s", text);
            System.out.println(sb);
        }
    }

}