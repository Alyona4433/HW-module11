import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Zip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        List<T> zippedList = new ArrayList<>();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            zippedList.add(iterator1.next());
            zippedList.add(iterator2.next());
        }
        Collections.shuffle(zippedList);
        return zippedList.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(10, 20, 30);

        Stream<Integer> zippedStream = zip(stream1, stream2);

        zippedStream.forEach(System.out::println);
    }
}
