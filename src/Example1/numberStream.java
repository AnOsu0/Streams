package Example1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class numberStream {
    public static void main(String[] args) {
        IntStream.iterate(0, n -> n + 1)
                .filter(n -> (n > 100 && n < 1000 && n % 5 == 0))
                .limit(10)
                .map(n -> n * 3)
                .forEach(System.out::println);


    }


}
