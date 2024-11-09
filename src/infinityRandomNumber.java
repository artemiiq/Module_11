import java.util.stream.Stream;


public class infinityRandomNumber {
    public static Stream<Long> generateRandomNumber(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = 1L << 48;
        long seed = System.currentTimeMillis();

        Stream<Long> randomStream = generateRandomNumber(a, c, m, seed);

        randomStream.limit(10).forEach(System.out::println);
    }
}
