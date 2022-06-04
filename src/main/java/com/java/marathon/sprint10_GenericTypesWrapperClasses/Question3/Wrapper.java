package com.java.marathon.sprint10_GenericTypesWrapperClasses.Question3;

import java.awt.*;

public class Wrapper<T extends Shape> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
