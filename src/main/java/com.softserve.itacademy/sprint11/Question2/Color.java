package com.softserve.itacademy.sprint11.Question2;

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
