package Java3hw.hw1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> boxFruits = new ArrayList<T>();

    public float getWeight() {
        if (boxFruits.size() == 0) {
            return 0.0f;
        }
        if (boxFruits.get(0) instanceof Apple) {
            return boxFruits.size() * 1.0f;
        } else if (boxFruits.get(0) instanceof Orange) {
            return boxFruits.size() * 1.5f;
        }
        return 0.0f;
    }

    public boolean compareByWeight(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    public boolean compareByType(Box<?> box) {
        return getClass() == box.getClass();
    }

    public boolean compareByTypeAndWeight(Box<T> box) {
        return getWeight() == box.getWeight();
    }
     public void transferTo(Box<T> box) {
         for (int i = boxFruits.size() - 1; i >= 0 ; i--) {
             box.addFruit(boxFruits.remove(i));
         }
     }

    public void addFruit(T fruit) {
        this.boxFruits.add(fruit);
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxFruits=" + boxFruits +
                '}';
    }
}