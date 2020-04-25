package com.softserve.itacademy.sprint07.Question4;

public enum LineType {
    SOLID("solid"),
    DOTTED("dotted"),
    DASHED("dashed"),
    DOUBLE("double");

    String lineType;

    LineType(String lineType) {
        this.lineType = lineType;
    }

    public String getLineType() {
        return lineType;
    }
}


