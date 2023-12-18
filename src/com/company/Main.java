package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //ООП

        //наслідовання
        //поліморфізм

        Animal cat = new Cat();
        Dog sharik = new Dog();
        Animal animal = new Animal();

        addAnimal(cat);
        addAnimal(sharik);
        addAnimal(animal);

    }

    public static void addAnimal(Animal animal){
        animal.move();
    }
}
