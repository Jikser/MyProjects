package Java2hw.l3_Collections;

import java.util.*;

public class PhoneDirectory {
    private Map<String, HashSet<String>> map;

    PhoneDirectory() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;
        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);
    }

    Set<String> get(String lastName) {
        return map.get(lastName);
    }
}