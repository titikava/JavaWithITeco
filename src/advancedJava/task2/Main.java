package advancedJava.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("До свапа: " + numbers);

        ArrayHelper.swap(numbers, 1, 3);
        System.out.println("После свапа: " + numbers);
    }
}
