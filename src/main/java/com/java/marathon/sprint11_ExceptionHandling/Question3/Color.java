package com.java.marathon.sprint11_ExceptionHandling.Question3;

enum Color {
    White,
    Red,
    Blue;

    public static Color getColorByName(String color) throws ColorException {
        try {
            return Color.valueOf(color);
        } catch (IllegalArgumentException e) {
            throw new ColorException("There is no such color: " + color);
        }
    }
}
