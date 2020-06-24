package sukkiri_3.ch15_04;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Instant timeAfter100Days = Instant.now().plusMillis(100L*24*60*60*1000);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(LocalDateTime.ofInstant(timeAfter100Days, TimeZone.getDefault().toZoneId()).format(dateTimeFormatter));
    }
}