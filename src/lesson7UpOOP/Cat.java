package lesson7UpOOP;

public class Cat {

    private final String name;
    private int stomach;
    private boolean satiety = false;

    boolean checkEat = false;

    public Cat(String name, int stomach) {
        this.name = name;
        if (stomach > 0) {
            this.stomach = stomach;
        } else {
            System.out.print("Incorrect stomach! Cat not created");
            System.exit(1);
        }
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }


    public void eat(Plate plate) {
        System.out.println(name + " eat");

        checkEat = plate.decrease(stomach);
        if (checkEat == true) {
            satiety = true;
        }
    }

}
