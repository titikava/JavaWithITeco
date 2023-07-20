package dataStructures;

import java.util.HashMap;

/**
 * Задача №3: Повторяющиеся элементы (База)
 * Подсчитайте повторяющиеся элементы в массиве с помощью HashMap.
 */
public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "d", "b", "c", "c", "c"};
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
