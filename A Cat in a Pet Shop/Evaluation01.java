package com.mycompany.evaluation01;

class Animal {

    private String species;
    private String healthstatus;

    public Animal(String species, String healthstatus) {
        this.species = species;
        this.healthstatus = healthstatus;
    }

    public void displayInfo() {
        System.out.println("Species: " + species);
        System.out.println("Healthstatus: " + healthstatus);
    }

    public void makesound() {
        System.out.println("Meow");
    }
}

class Cat extends Animal {

    public Cat(String species, String healthstatus) {
        super(species, healthstatus);
    }

    public void makesound(String personName) {
        System.out.println(personName + " interacts with Mimi: Meow Meow");
    }
}

public class Evaluation01 {

    public static void main(String[] args) {

        Cat Mimi = new Cat("Cat", "Healthy");

        Mimi.displayInfo();
        Mimi.makesound("Rahim");

        Animal a = Mimi;
        a.makesound();
    }
}
