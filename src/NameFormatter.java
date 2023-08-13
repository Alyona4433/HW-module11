import java.util.List;

public class NameFormatter {

    public static String formatNames(List<String> names) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < names.size(); i++) {
            if (i % 2 == 0) {
                result.append((i + 1)).append(". ").append(names.get(i));
                if (i < names.size() - 2) {
                    result.append(", ");
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Peter", "Mary", "Alice", "Michael");
        String formattedNames = formatNames(names);
        System.out.println(formattedNames);
    }
}
