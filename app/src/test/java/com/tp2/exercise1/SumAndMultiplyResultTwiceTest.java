package com.tp2.exercise1;

import com.tp2.exercise_1.SumAndMultiplyResultTwice;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumAndMultiplyResultTwiceTest {
    @Test
    public void test() {
        int result = SumAndMultiplyResultTwice.execute(1, 2);
        assertEquals(6, result);
    }
}