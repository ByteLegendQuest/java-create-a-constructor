package com.bytelegend;

public class Cat {
    public String name;

    private void Cat(name){
        Cat cat = new Cat();
        cat.name =name;
        return cat;
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
