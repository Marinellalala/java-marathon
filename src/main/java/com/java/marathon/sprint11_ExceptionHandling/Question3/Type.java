package com.java.marathon.sprint11_ExceptionHandling.Question3;

enum Type {
    Rare,
    Ordinary;

    public static Type getTypeByString(String type) throws TypeException {
        try {
            return Type.valueOf(type);
        } catch (IllegalArgumentException e){
            throw new TypeException("There is no such type: " + type);
        }
    }
}
