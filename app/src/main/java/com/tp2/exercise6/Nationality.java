package com.tp2.exercise6;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Nationality {
    private final List<Color> colors;

    private Nationality(List<Color> colors) {
        this.colors = colors;
    }

    public static Nationality buildForDutch() {
        return new Nationality(Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
    }

    public static Nationality buildForGerman() {
        return new Nationality(Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
    }

    public static Nationality buildForBelgian() {
        return new Nationality(Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
    }

    public static Nationality buildForFrench() {
        return new Nationality(Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
    }

    public static Nationality buildForItalian() {
        return new Nationality(Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
    }

    public static Nationality buildForDefault() {
        return new Nationality(Arrays.asList(Color.GRAY));
    }

    public List<Color> getColors() {
        return colors;
    }
}