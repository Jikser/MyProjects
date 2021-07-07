package lesson6OOP.Animals;

public abstract class Animal {


    public void swim(int obstacleLenght){
        System.out.println("The animal swam "+ obstacleLenght + " meters");

    }
    public void run(int obstacleLenght){
        System.out.println("The animal ran "+ obstacleLenght + " meters");
    }
}
