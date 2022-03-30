package Example2;

import java.util.*;
import java.util.stream.Stream;

class MatchApp {
    public static void main(String[] args) {
        Stream<Match> results = createStream();
        results.sorted(Comparator.comparingInt(MatchApp::goalDifference))
                .forEach(System.out::println);

        System.out.println("\nMecze w których brała udział wybrana drużyna");
        Stream<Match> results1 = createStream();
        results1.filter(m1 -> checkTeamName("Polska", m1))
                .forEach(System.out::println);

        System.out.println("\nLiczba drużyn biorących udział w rozgrywkach: " +
                numberOfNames(createStream()));

        System.out.println("\nLiczba goli strzelonych we wszystkich rozgrywkach: " +
                goalsSum(createStream()));



    }
private static int goalsSum(Stream<Match> stream){
    return stream.mapToInt(m -> (m.getHomeTeamGoals() + m.getAwayTeamGoals())).sum();
}

    private static int goalDifference(Match m1) {
        return -(m1.getHomeTeamGoals() - m1.getAwayTeamGoals());
    }

    private static boolean checkTeamName(String name, Match match) {
        return (match.getAwayTeam().toLowerCase().equals(name.toLowerCase())
                || match.getHomeTeam().toLowerCase().equals(name.toLowerCase()));
    }

//    private static List<String> listOfHomeNames(Stream<Match> stream) {
//        return stream.map(Match::getHomeTeam)
//                .toList();
//    }
//
//    private static List<String> listOfAwayNames(Stream<Match> stream) {
//        return stream.map(Match::getAwayTeam)
//                .toList();
//    }

    private static String[] getNames (Match match){
        String[] names = new String[2];
        names[0] = match.getHomeTeam();
        names[1] = match.getAwayTeam();
        return names;
    }

    private static long numberOfNames(Stream<Match> stream){
       return stream.map(m -> getNames(m))
                .flatMap(Arrays::stream)
                .distinct()
               .count();
    }
//
//    private static int streamOfNames() {
//        Stream<Match> stream = createStream();
//        List<String> awayNames = listOfAwayNames(stream);
//        Stream<Match> stream1 = createStream();
//        List<String> homeNames = listOfHomeNames(stream1);
//        List<String> newList = new ArrayList<>();
//        newList.addAll(awayNames);
//        newList.addAll(homeNames);
//        return newList.stream();
//    }

    private static Stream<Match> createStream() {
        return Stream.of(
                Match.matchFactoryMetchod("Polska", "Irlandia", 2, 0),
                Match.matchFactoryMetchod("Brazylia", "Francja", 0, 3),
                Match.matchFactoryMetchod("Włochy", "Polska", 2, 1),
                Match.matchFactoryMetchod("Brazylia", "Argentyna", 2, 2),
                Match.matchFactoryMetchod("Anglia", "Niemcy", 1, 2),
                Match.matchFactoryMetchod("Anglia", "Francja", 3, 0),
                Match.matchFactoryMetchod("Polska", "Portugalia", 1, 0),
                Match.matchFactoryMetchod("Brazylia", "Niemcy", 3, 3)
        );
    }

}
