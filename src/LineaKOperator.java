import java.util.stream.Stream;

public class LineaKOperator {

    public static Stream<Long> generateRandomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 123456789L;

        Stream<Long> randomStream = generateRandomStream(a, c, m, seed);

        randomStream.limit(10)  // гаприклад обмеження до 10 чисел
                .forEach(System.out::println);
    }
}
