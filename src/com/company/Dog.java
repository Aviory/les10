package com.company;

public class Dog extends Animal {
    public void voice(){
        System.out.println("voice dogs");
    }
    @Override
    public void move() {
        System.out.println("move like dog");
    }
}
