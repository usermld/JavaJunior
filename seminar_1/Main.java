package seminar_1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Main {
    public static void main(String[] args) {
        System.out.println("Начало программы");
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average();

        if (average.isPresent()) {
            System.out.println("Среднее значение всех четных чисел в списке: " + average.getAsDouble());
        } else {
            System.out.println("В списке нет четных чисел.");
        }

    }
}
