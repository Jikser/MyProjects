package lesson7UpOOP;

public class Plate {
    private int food;
    private final int maxFood;


    public Plate(int food, int maxFood) {
        this.food = food;
        this.maxFood = maxFood;
    }

    public void increaseFood(int income) {
        if (food + income > maxFood) {
            System.out.println("The food fell out of the plate, but plate is full");
            food = maxFood;
        } else {
            food += income;
        }
    }


    public boolean decrease(int amount) {
        if (food < amount) {
            System.out.println("There is not enough food in the plate");
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
