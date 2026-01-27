package com.testperformance;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

public class PerformanceUtilsTest {

    PerformanceUtils utils = new PerformanceUtils();

    @Test
    @Timeout(2) // seconds
    void testLongRunningTaskTimeout() throws InterruptedException {
        utils.longRunningTask();
    }
}
