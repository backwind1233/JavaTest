package javase;

import com.java.se.Week;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by zhihaoguo on 15/3/3.
 */
public class TestWeek {
    private Week week =Week.MON;
    @Test
    public  void testWeek(){
        assertEquals(week.toString(),"星期一");

    }
}

