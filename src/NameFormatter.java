import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NameFormatter {
    public static void main(String[] args) {
        String[] names = new String[]{"Ivan", "John", "Peter", "Mary", "Alice", "Michael"};
        formatNames(names);
    }
    public static void formatNames(String[] names) {
        System.out.println(Arrays.stream(names)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", ")));
    }
}
