package Lesson3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class IntermediateOperations {
    public static void main(String[] args) {
//        List<Integer> collect = IntStream.rangeClosed(0, 10)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(collect);
//        Stream.of(
////                new Course(1L, "Java", 199, "Programowanie"),
////                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
////                new Course(1L, "Java", 199, "Programowanie"),
////                new Course(3L, "Tajniki Google", 299, "Marketing"),
////                new Course(1L, "Java", 199, "Programowanie")
//                        new Course(1L, "Java", 249, "Programowanie"),
//                        new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                        new Course(3L, "Zarządznie zespołem", 159, "Biznes"),
//                        new Course(4L, "Tajniki Google", 299, "Marketing"),
//                        new Course(5L, "Python od podstaw", 269, "Programowanie")
//                ).filter(c -> c.getPrice() > 200)
//                .forEach(System.out::println);

//        Course[] cheapcourses = {
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(3L, "Zarządznie zespołem", 159, "Biznes"),
//        };
//
//        Course[] expensivecourses = {
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(4L, "Tajniki Google", 299, "Marketing"),
//        };
//
//        Stream.of(cheapcourses, expensivecourses)
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);
//        List<Integer> collect = IntStream.iterate(0, n -> n + 1)
//                .limit(100)
//                .boxed()
//                .collect(Collectors.toList());
//        Stream<Course> courses = Stream.of(
//                new Course(1L, "Java", 199, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(1L, "Java od podstaw", 199, "Programowanie"),
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Java", 199, "Programowanie")
//        );
////        Stream<Course> uniqueCourses = courses.distinct();
////        uniqueCourses.forEach(System.out::println);
//        List<String> namesWithJava = courses.map(Course::getName)
//                .filter(s -> s.toLowerCase().contains("java"))
//                .collect(Collectors.toList());
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania java", 99, "Rozwój osobisty"),
                new Course(3L, "Zarządznie zespołem", 159, "Biznes"),
                new Course(4L, "Tajniki Google", 299, "Marketing"),
                new Course(5L, "Python od podstaw", 269, "Programowanie")
        );
//        Stream<Course> sorted = courses.sorted((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
//        sorted.forEach(System.out::println);

//        List<String> javaTitles = courses.filter(c -> c.getName().toLowerCase().contains("java"))
//                .peek(c -> System.out.println("filtered cours " + c))
//                .map(Course::getName)
//                .collect(Collectors.toList());
//
//        System.out.println(javaTitles);

        Stream<Course> withoutCheapCourses = courses.sorted(Comparator.comparingDouble(Course::getPrice))
                .skip(3);
        withoutCheapCourses.forEach(System.out::println);

    }
}
