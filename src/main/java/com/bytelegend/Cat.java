package com.bytelegend;

public class Cat {
    public String name;

    public static String Cat(String s)
    {
        name = s;
        return toString(name);
    }

    public static void main(String[] args) {
        System.out.println(new Cat("Black"));
        System.out.println(new Cat("White"));
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
