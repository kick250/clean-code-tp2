package com.tp2.exercise7;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReportServiceTest {
    @Test
    public void test() {
        ReportService service = new ReportService("PDF");

        boolean success;
        try {
            service.generateReport();
            success = true;
        } catch (Exception e) {
            success = false;
        }

        assertTrue(success);
    }
}