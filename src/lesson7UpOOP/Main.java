package lesson7UpOOP;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100, 100);

        Cat[] cats = new Cat[]{
                new Cat("Zosya", 15),
                new Cat("Myrka", 18),
                new Cat("Vaska", 35),
                new Cat("Petrovich", 50)
        };

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.printf("Cat: %s, satiety: %b \n", cats[i].getName(), cats[i].getSatiety());
        }

        System.out.println(plate);

        plate.increaseFood(10);
        System.out.println(plate);
        plate.increaseFood(200);
        System.out.println(plate);

    }
}
