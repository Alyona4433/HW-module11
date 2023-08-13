import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MassivChisla {

    public static String processNumberLists(List<String> inputList) {
        List<Integer> numbers = new ArrayList<>();

        for (String str : inputList) {
            String[] numStrings = str.split(", ");
            for (String numStr : numStrings) {
                numbers.add(Integer.parseInt(numStr));
            }
        }

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        return sortedNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("1, 2, 0", "4, 5");
        String result = processNumberLists(inputList);
        System.out.println(result);
    }
}
