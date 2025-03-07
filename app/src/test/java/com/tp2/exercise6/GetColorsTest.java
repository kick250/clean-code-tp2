package com.tp2.exercise6;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.awt.*;


public class GetColorsTest {

    @Test
    public void test() {
        GetColors getColors = new GetColors();
        Nationality nationality = Nationality.buildForDutch();
        List<Color> result = getColors.getFlagColors(nationality);

        assertTrue(result.contains(Color.RED));
        assertTrue(result.contains(Color.WHITE));
        assertTrue(result.contains(Color.BLUE));
    }
}