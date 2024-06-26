package by.myStreams;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //task 1
        System.out.println("Task 1:");
        transactions.stream()
                .filter(x -> x.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
        //task 2
        System.out.println("Task 2:");
        Stream.of(raoul, mario, alan, brian)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);
        //task 3
        System.out.println("Task 3:");
        Stream.of(raoul, mario, alan, brian)
                .filter(x -> x.getCity() == "Cambridge")
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
        //task 4
        System.out.println("Task 4:");
        Stream.of(raoul, mario, alan, brian)
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(x -> System.out.print(x.getName() + " "));
        //task 5
        System.out.println();
        System.out.println("Task 5:");
        System.out.println(Stream.of(raoul, mario, alan, brian)
                .anyMatch(x -> x.getCity() == "Milan"));
        //task 6
        System.out.println("Task 6:");
        System.out.println(transactions.stream()
                .filter(x -> x.getTrader().getCity() == "Cambridge").
                mapToInt(x -> x.getValue()).sum());
        //task 7
        System.out.println("Task 7:");
        System.out.println(transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.naturalOrder())
                .get());
        //task 8
        System.out.println("Task 8:");
        System.out.println(transactions.stream()
                .reduce(BinaryOperator.minBy(Comparator.comparing(Transaction::getValue)))
                .get());
    }
}
