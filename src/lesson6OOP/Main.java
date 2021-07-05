package lesson6OOP;

import lesson6OOP.Animals.Animal;
import lesson6OOP.Animals.Cat;
import lesson6OOP.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.run(123);
        cat.run(500);
        cat.swim(200);
        dog.run(150);
        dog.run(600);
        dog.swim(6);

        Animal cat2 = new Cat();
        Animal cat3 = new Cat();
        Animal dog3 = new Dog();

        System.out.println();
        System.out.println("Cat created: " + Cat.catCounter);
        System.out.println("Dog created: " + Dog.dogCounter);

    }
}
