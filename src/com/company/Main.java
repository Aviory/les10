package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //ООП
        new UI();
        //наслідовання
        //поліморфізм

        Animal cat = new Cat();
        Dog sharik = new Dog();
//        Animal animal = new Dog();
        Zoo zoo = new Zoo();
        zoo.addAnimal(cat);
        zoo.addAnimal(sharik);
//        zoo.addAnimal(animal);
        zoo.dogVoice();
    }


}
