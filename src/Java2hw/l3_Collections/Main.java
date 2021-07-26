package Java2hw.l3_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Task 1:
        String[] words = {"We", "Are", "Not", "Gonna", "Take", "It", "mouse", "pulse", "rock", "mouse", "tool", "rock", "We", "will", "rock", "We"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);

        //Task 2:
        PhoneDirectory pd = new PhoneDirectory();
        pd.add("Putin", "84950000001");
        pd.add("Lavrov", "84990000002");
        pd.add("Bayden", "12098524685");
        pd.add("Lavrov", "89167779777");
        System.out.println(pd.get("Lavrov"));
        System.out.println(pd.get("Putin"));
    }
}
