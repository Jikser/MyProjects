package Java2hw.l1;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Vasiliy", 2, 150);
        Robot robot = new Robot("R2D2", 10, 10000);
        Cat cat = new Cat("Pussy", 5, 500);

        User[] arraySportsmen = new User[3];
        arraySportsmen[0] = man;
        arraySportsmen[1] = robot;
        arraySportsmen[2] = cat;

        Usable[] arrayUsable = {
                new Treadmill(1000),
                new Wall(5)};

        for (int i = 0; i < arraySportsmen.length; i++) {
            User sportsmen = arraySportsmen[i];
            for (int j = 0; j < arrayUsable.length; j++) {
                arrayUsable[j].use(sportsmen);
            }
        }
    }
}
