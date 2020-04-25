package com.softserve.itacademy.sprint06.Test.Q4;

public class MyClass extends AbstractClass {

    public MyClass(){
        super();
        setField(2);
    }

    public void setField(int field){
        this.field = field;
    }

    final public int getField(){
        return field;
    }
}
