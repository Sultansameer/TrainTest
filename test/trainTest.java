import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;
import static org.junit.jupiter.api.Assertions.*;

class trainTest {

    @Test
    public void isbeforeninehalf() {
        var trainn = new train();
        LocalTime t1 = LocalTime.of(8, 00, 00);
        assertEquals("full", trainn.pay(t1));
    }

    @Test
    public void isbetfourandsevenhalf() {
        var trainn = new train();
        LocalTime t = LocalTime.of(18, 00, 00);
        assertEquals("full", trainn.pay(t));
    }

    @Test
    public void isbetninehalfandfour() {
        var trainn = new train();
        LocalTime t = LocalTime.of(11, 00, 00);
        assertEquals("saver", trainn.pay(t));
    }

    @Test
    public void isaftersevenhalf() {
        var trainn = new train();
        LocalTime t = LocalTime.of(21, 00, 00);
        assertEquals("saver", trainn.pay(t));
    }
    @Test
    public void isninehalfsaver() {
        var trainn = new train();
        LocalTime t = LocalTime.of(9, 30, 00);
        assertEquals("saver", trainn.pay(t));
    }
    @Test
    public void isfoursaver() {
        var trainn = new train();
        LocalTime t = LocalTime.of(16, 00, 00);
        assertEquals("saver", trainn.pay(t));
    }
    @Test
    public void issevenhalffull() {
        var trainn = new train();
        LocalTime t = LocalTime.of(19, 30, 00);
        assertEquals("full", trainn.pay(t));
    }

}


