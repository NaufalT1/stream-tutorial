import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstAssignment {

    public static void main(String[] args) {
        List<Integer> numberIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Given a list of integers, find out all the even numbers exist in the
        // list using Stream functions
        List<Integer> evenNumberIntegers = numberIntegers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumberIntegers);

        // Given a list of integers, find out all the numbers starting with 1 using
        // Stream functions
        List<Integer> startWith1Integers = numberIntegers.stream()
                .filter(n -> n.toString().startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(startWith1Integers);

        // Given a list of integers, find the total number of elements present in the
        // list using Stream functions
        Long numberOfElements = numberIntegers.stream()
                .count();
        System.out.println(numberOfElements);

        // Given a list of integers, sort all the values present in it using Stream
        // functions
        List<Integer> randNumIntegers = Arrays.asList(4, 2, 7, 1, 9);
        List<Integer> sortedNumIntegers = randNumIntegers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Before sorting: " + randNumIntegers +
                "\nAfter sorting: " + sortedNumIntegers);

    }

}