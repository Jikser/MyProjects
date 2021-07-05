package lesson6OOP.Animals;

public class Cat extends Animal {
    public static int catCounter = 0;

    public Cat() {
        catCounter++;
    }


    @Override
    public void run(int obstacleLenght) {
        if (obstacleLenght <= 0) {
            System.out.println("The cat remained the place");
        } else if (obstacleLenght > 200) {
            System.out.println("The cat does not run more than 200 meters");
        } else {
            System.out.println("The cat ran " + obstacleLenght + " meters");
        }
    }

    @Override
    public void swim(int obstacleLenght) {
        System.out.println("The cat can't swim!");
    }


}
