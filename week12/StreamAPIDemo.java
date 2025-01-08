package week12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> numberStream = numbers.stream();

        // allMatch/nonematch/anymatch
        boolean allGreaterThanZero = numbers.stream().allMatch(n -> n > 0);
        boolean noneGreaterThanTen = numbers.stream().noneMatch(n -> n > 10);
        boolean anyEqualsThree = numbers.stream().anyMatch(n -> n == 3);

        long count = numbers.stream().count();

        Stream<Integer> infiniteStream = Stream.generate(() -> 1);
        Stream<Integer> limitedStream = infiniteStream.limit(10);

        numbers.stream().forEach(System.out::println);

        Optional<Integer> first = numbers.stream().findFirst();
        Optional<Integer> any = numbers.stream().findAny();
        first.ifPresentOrElse(System.out::println, () -> System.out.println("No element found"));

        List<Integer> filtered = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> sorted = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<String> mapped = numbers.stream().map(n -> "Number: " + n).collect(Collectors.toList());

        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("All greater than zero: " + allGreaterThanZero);
        System.out.println("None greater than ten: " + noneGreaterThanTen);
        System.out.println("Any equals three: " + anyEqualsThree);
        System.out.println("Count: " + count);
        System.out.println("Filtered: " + filtered);
        System.out.println("Sorted: " + sorted);
        System.out.println("Mapped: " + mapped);
        System.out.println("Sum: " + sum.orElse(0));
    }
}
