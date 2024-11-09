import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class sortedUpperNames {
    public static List<String> printSortedUpperNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("John", "Bill", "Paul", "Zara", "Suzan", "Bob");
        System.out.println(printSortedUpperNames(names));
    }
}
