package com.company;

public class Zoo {
    Animal[] animals = new Animal[10];
    int len;//1

    public void addAnimal(Animal animal){
        animal.move();
        animals[len] = animal;
        len++;
    }

    public void dogVoice(){
        for (Animal animal:animals  ) {
            if (animal instanceof Dog){
                Dog d = (Dog) animal;
                d.voice();
            }
        }
    }
}
