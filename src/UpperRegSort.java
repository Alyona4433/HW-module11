import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpperRegSort {

    public static List<String> processStrings(List<String> inputList) {
        List<String> processedList = new ArrayList<>();

        for (String str : inputList) {
            processedList.add(str.toUpperCase());
        }

        Collections.sort(processedList, Collections.reverseOrder());

        return processedList;
    }

    public static void main(String[] args) {
        List<String> inputList = List.of("Ivan", "John", "Peter", "Mary", "Alice", "Michael");
        List<String> processedList = processStrings(inputList);

        for (String str : processedList) {
            System.out.println(str);
        }
    }
}
