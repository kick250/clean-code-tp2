package com.tp2.exercise10;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonitoringTest {
    @Test
    public void test() {
        Monitoring monitoring = new Monitoring();

        assertEquals(0, monitoring.getAccessCount());
        monitoring.sumAccess();
        assertEquals(1, monitoring.getAccessCount());
        monitoring.sumAccess();
        assertEquals(2, monitoring.getAccessCount());
        monitoring.sumAccess();
        assertEquals(3, monitoring.getAccessCount());
    }
}