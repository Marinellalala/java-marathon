package com.java.marathon.sprint10_GenericTypesWrapperClasses.Question4;

public class Array<T> {

    private T[] array;

    public Array(T[] array){
        this.array = array;
    }

    public T get(int index){
        return array[index];
    }

    public int length(){
        return array.length;
    }
}
