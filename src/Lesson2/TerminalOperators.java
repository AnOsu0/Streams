package Lesson2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TerminalOperators {
    public static void main(String[] args) {
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

//        ArrayList<Course> courseList = courses.collect(Collectors.toCollection(ArrayList::new));
        Double corsesPrice = courses.map(Course::getPrice).reduce(0.0, (result, next)
                -> result + next);
        System.out.println("Wszystkie kursy kosztują razem " + corsesPrice);
//        ArrayList<Course> coursesList = courses.collect(
//                ArrayList<Course>::new,
//                ArrayList::add,
//                ArrayList::addAll
//        );

//        Course[] courses1 = courses.toArray(Course[]::new);

//        Optional<Course> cheapestCourse = courses.min(Comparator.comparingDouble(Course::getPrice));
//        cheapestCourse.ifPresent(System.out::println);

//        courses.allMatch(c -> c.getPrice() > 10);
////      courses.noneMatch(c -> c.getPrice()>300);
//
//        boolean b = courses.anyMatch(c -> c.getPrice() < 100);
//        System.out.println(b);
//        long count = courses.count();
//
//        courses.forEach(System.out::println);

        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");
        String reduce = names.reduce("", (result, next) -> result + next);
        System.out.println(reduce);
    }
}
