package com.bytelegend;

public class Cat {
    public String name;

    public static void main(String[] args) {
        System.out.println(new Cat("Black"));
        System.out.println(new Cat("White"));
    }

    @Override
    public Cat(string name){
        this.name=name;
    }
}
