package advancedJava.task2;

import java.util.List;

public class ArrayHelper {
    public static <Type> void swap(List<Type> list, int a, int b) {
        Type temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}