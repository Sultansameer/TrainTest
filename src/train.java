import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class train {

    public String pay(LocalTime time1) {
        LocalTime time2 = LocalTime.of(9,30,00);
        LocalTime time3 = LocalTime.of(16,01,00);
        LocalTime time4 = LocalTime.of(19,31,00);
        if (time1.isBefore(time2)) {
           return "full";
        } else if (time1.isBefore(time3)) {
            return "saver";
        } else if (time1.isBefore(time4)) {
           return "full";
        } else  {
            return "saver";
        }


    }
}
