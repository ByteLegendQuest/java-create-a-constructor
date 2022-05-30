package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        System.out.println(new Cat("Black"));
        System.out.println(new Cat("White"));
    }

    @Override
    public String new Cat (String name) {
        Cat name = new Cat();
        return "Cat(" + name.name + ")";
    }
}
