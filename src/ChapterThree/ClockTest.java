package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {
    Clock clock;
    @BeforeEach
    public void clockExist(){
        clock = new Clock(24, 15, 20);
    }
    @Test public void TestForClockHour(){
        clock.hour(24);
        assertNotNull(clock.getHour());
    }
    @Test public void TestForClockMinute(){
        clock.minute(15);
        assertNotNull(clock.getMinute());
    }
    @Test public void TestForClockSecond(){
        clock.second(20);
        assertNotNull(clock.getSecond());
    }
}