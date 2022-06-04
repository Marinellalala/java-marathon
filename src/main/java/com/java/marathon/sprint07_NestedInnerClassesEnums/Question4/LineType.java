package com.java.marathon.sprint07_NestedInnerClassesEnums.Question4;

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


