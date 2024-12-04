import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumbers {
    public static String printSortedNumbers(List<String> numbers) {
        List<Integer> numbersList = numbers.stream()
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .toList();
        return numbersList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> numbers = List.of("1, 2, 0", "4, 5");
        System.out.println(printSortedNumbers(numbers));
    }
}
