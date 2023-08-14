import java.util.Arrays;
import java.util.stream.Collectors;

public class MassivChisla {

    public static String processNumberArrays(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = processNumberArrays(inputArray);
        System.out.println(result);
    }
}
