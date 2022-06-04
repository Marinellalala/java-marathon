package com.java.marathon.sprint06_ClassDesignPolymorphism.Test.Q4;

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
