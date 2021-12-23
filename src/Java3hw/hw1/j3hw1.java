package Java3hw.hw1;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class j3hw1 {
    public static void main(String[] args) {
        String[] stringArray = new String[]{"Солнце", "светит", "Ярко"};
        replacement(stringArray, 0, 2);
        System.out.println(Arrays.toString(stringArray));

        Integer[] arrInt = {1, 2, 3, 4, 5};
        toArrayList(arrInt);
        toArrayList(stringArray);

        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple3);
        box1.addFruit(apple4);
        System.out.println("Коробка 1:" + box1 + "\n");
        box1.transferTo(box2);
        System.out.println("Коробка 2:" + box2 + "\n");
        box1.addFruit(orange1);
        box1.addFruit(orange2);
        box1.addFruit(orange3);
        System.out.println("Коробка 1:" +box1);
    }

    // Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static <T> void replacement(T[] array, int in, int to) {
        if (in < 0 || in >= array.length || to < 0 || to >= array.length || in == to) {
            System.out.println("Неккоректный ввод данных");
            return;
        }
        T type = array[to];
        array[to] = array[in];
        array[in] = type;
    }

    // Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T> toArrayList(T[] array){
        ArrayList<T> newArrayList = new ArrayList<>(array.length);
        Collections.addAll(newArrayList, array);
        return newArrayList;
    }
}
