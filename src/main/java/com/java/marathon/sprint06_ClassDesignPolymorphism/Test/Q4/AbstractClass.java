package com.java.marathon.sprint06_ClassDesignPolymorphism.Test.Q4;

abstract class AbstractClass {
    protected int field;

    AbstractClass(){
        field =1;
    }

    abstract protected void setField(int field);

//    abstract final public int getField();
}
