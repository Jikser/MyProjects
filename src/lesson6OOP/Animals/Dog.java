package lesson6OOP.Animals;

public class Dog extends Animal{
    public static int dogCounter;

    public Dog(){
        dogCounter++;
    }

    @Override
    public void run(int obstacleLenght){
        if (obstacleLenght <= 0){
            System.out.println("The dog remained the place");
        } else if (obstacleLenght > 500){
            System.out.println("The dog does not run more than 500 meters");
        } else {
            System.out.println("The dog ran " + obstacleLenght + " meters");
        }
    }
    @Override
    public void swim(int obstacleLenght){
        if (obstacleLenght <= 0){
            System.out.println("The dog remained the place");
        } else if (obstacleLenght > 10){
            System.out.println("The dog does not swim more than 10 meters");
        } else {
            System.out.println("The dog swam " + obstacleLenght + " meters");
        }
    }


}
