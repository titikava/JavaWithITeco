package dataStructures;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Задача №1: Медиана массивов (База)
 * Для двух отсортированных массивов nums1 и nums2 вернуть медианное значение двух отсортированных массивов.
 *
 * Пример 1:
 * Ввод: nums1 = [1,3], nums2 = [2]
 *  Вывод: 2.00000
 *
 *  Объяснение: объединенный массив = [1,2,3], а медиана равна 2.
 *
 * Пример 2:
 * Ввод: nums1 = [1,2], nums2 = [3,4]
 *  Вывод: 2.50000
 *
 *  Объяснение: объединенный массив = [1,2,3,4], а медиана равна (2 + 3) / 2 = 2,5.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};

        ArrayList<Integer> mergedList = new ArrayList<>();

        for(int num1 : nums1){
            mergedList.add(num1);
        }
        for (int num2 : nums2){
            mergedList.add(num2);
        }

        Collections.sort(mergedList);

        if (mergedList.size() % 2 == 0) {
            int mid1 = mergedList.get(mergedList.size() / 2 - 1);
            int mid2 = mergedList.get(mergedList.size() / 2);
            System.out.println((mid1 + mid2) / 2.0);
        } else {
            System.out.println(mergedList.get(mergedList.size()) / 2);
        }
    }
}
