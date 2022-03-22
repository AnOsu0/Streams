package Lesson1;

import javax.security.sasl.SaslClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamExample {
    public static void main(String[] args) throws FileNotFoundException {
//        Stream<String> stream = Stream.of("a", "b", "c");
//
//        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
//
//        int[] evenints = intStream
//                .filter(i -> i % 2 == 0)
//                .toArray();
//
//        System.out.println(Arrays.toString(evenints));
//
//        String[] strings = stream.map(String::toUpperCase).toArray(String[]::new);
//        System.out.println(Arrays.toString(strings));

//
//        int[] num  = IntStream.iterate(0, x -> x + 1)
//                .limit(100)
//                .map(x -> x*x)
//                .filter(x -> x%2 == 0 )
//                .toArray();
//
//        System.out.println(Arrays.toString(num));

//        int[] num = IntStream.rangeClosed(0,99).toArray();
//        System.out.println(Arrays.toString(num));

        Scanner scan = new Scanner(new File("file.txt"));
//        while (scan.hasNextLine()){
//            System.out.println(scan.nextLine());
//        }
        scan.tokens()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
