import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zulfiquer on 1/14/18.
 */
public class BirthdayHeightTest {

    private BirthdayHeight test = new BirthdayHeight();
    @Test
    public void timeConversiontest() throws Exception {
        String time = new String("11:00:10PM");
        String found = test.timeConversion(time);
        System.out.println(found);
    }

}