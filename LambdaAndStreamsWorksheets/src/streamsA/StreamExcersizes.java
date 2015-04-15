package streamsA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Squall on 01/04/2015.
 */
public class StreamExcersizes {
    public static void main(String[] args) {
        StreamExcersizes se = new StreamExcersizes();
        se.launch();
    }

    public void launch() {
        List<String> words = Arrays.asList("Gone", "Qua", "Moo", "Jump", "Skip", "Burger", "Pizza", "Jar", "In", "Ent", "Eel", "Que", "Paq");
/*Q1*/  words.stream().forEach((str) -> System.out.println("  " + str));
        System.out.println();

/*Q2*/  words.stream().forEach(System.out::println);
        System.out.println();

/*Q3*/  words.stream().map((str) -> str + "!").forEach(System.out::println);
        System.out.println();
/*Q3*/  words.stream().map((str) -> str.replace("i", "eye")).forEach(System.out::println);
        System.out.println();
/*Q3*/  words.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println();
/*Q4*/  words.stream().filter((str) -> str.length() < 4).forEach(System.out::println);
        System.out.println();
/*Q4*/  words.stream().filter((str) -> str.contains("b") || str.contains("B")).forEach(System.out::println);
        System.out.println();
/*Q4*/  words.stream().filter((str) -> str.length() % 2 == 0).forEach(System.out::println);
        System.out.println();

/*Q5a*/  System.out.println(words.stream().map(String::toUpperCase).filter((str) -> str.length() < 4).filter((str) -> str.contains("E"))
                .findFirst().get());
/*Q5b*/  System.out.println(words.stream().map(String::toUpperCase).filter((str) -> str.length() < 4).filter((str) -> str.contains("Q"))
                .findFirst().get());
        System.out.println();

/*Q6*/  words.stream().map(String::toUpperCase)
                .filter(checkLength).filter((str) -> str.contains("Q")).findFirst().get();
        System.out.println();

/*Q7*/  System.out.println(words.stream().reduce((s1, s2) -> s1 + s2).get());
        System.out.println();

/*Q8*/  System.out.println("Q8:" + words.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + s2).get());
        System.out.println();

/*Q9*/  System.out.println("Q9:" + words.stream().reduce((s1, s2) -> s1 + ", " + s2).get());
        System.out.println();

/*Q10 Test*/
        List<Double> nums = randomNumberList(5);
        System.out.println("Q10:" + nums);
        System.out.println();

/*Q11 Test*/
        List<Integer> numbs = orderedStepList(20, 30, 2000);
        System.out.println("Q11:" + numbs);
        System.out.println();

/*Q12 Test*/
        List<Integer> numForSum = orderedStepList(12, 2, 80);
        System.out.println("Q12:" + numForSum.stream().reduce(Integer::sum).get());
        System.out.println();

/*Q13 Test*/
        System.out.println("Q13:" + numForSum.stream().parallel().reduce(Integer::sum).get());
        System.out.println();

/*Q14 Test*/
        List<Double> doubleList = consistentDoubleList(1.5, 3.0, 2000);
        System.out.println("Q14np: " + doubleList.stream().reduce(Double::sum).get());
        System.out.println("Q14p: " + doubleList.parallelStream().reduce(Double::sum).get());
        System.out.println();
    }

  /*
    Method Def Questions
  */

/*Q6e*/ Predicate<String> checkLength = n -> {
            System.out.println("Current String " + n); //Prints only 2 CAPS words as Qae is a matching result
            return n.length() < 4;                     //And Lazy Evaluation doest iterate through every element for each
        };                                             // function call


/*Q10*/ public static List<Double> randomNumberList(int number) {
            Stream<Double> stream = Stream.iterate(new Random().nextDouble(), n -> new Random().nextDouble()).limit(number);
            return stream.collect(Collectors.toList());
        }

/*Q11*/ public static List<Integer> orderedStepList(int start, int step, int end) {
            Stream<Integer> stream = Stream.iterate(start, n -> n + step).limit(end).filter((n) -> n <= end);
            return stream.collect(Collectors.toList());
        }

        public static List<Double> consistentDoubleList(Double start, Double step, Integer end) {
            Stream<Double> stream = Stream.iterate(start, n -> n + step).limit(end).filter(n -> n <= end);
            return stream.collect(Collectors.toList());
        }

}
