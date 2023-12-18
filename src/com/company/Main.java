package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //ООП
        int a= 5;

        //наслідовання
        Animal animal = new Animal();
        Animal cat = new Cat();

//        animal.move();

        cat.move();
        if (cat instanceof Cat){
            Cat murr = (Cat) cat;
            murr.eat();
        }

    }
}
