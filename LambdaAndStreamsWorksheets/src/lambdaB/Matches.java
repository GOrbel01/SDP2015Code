package lambdaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Squall on 31/03/2015.
 */
public class Matches {
    public static void main(String[] args) {
        String[] arrs = new String[]{"Str", "Gone", "Hippo", "Stronger", "Sharp", "Hi", "Do", "The"};
        Integer[] iarrs = new Integer[]{1, 5, 7, 3, 22, 8, 9, 12, 15, 16};
        Arrays.sort(iarrs,(n1, n2) -> n1 - n2);
        List<String> words = Arrays.asList(arrs);
        List<Integer> nums = Arrays.asList(iarrs);
        List<String> shortWords = allMatches(words, (str) -> str.length() < 4);
        List<String> wordsStartWithH = allMatches(words, (str) -> Character.toUpperCase(str.charAt(0)) == 'H');
        System.out.println(shortWords);
        System.out.println(wordsStartWithH);
        List<Integer> evenNumbers = allMatches(nums, (num) -> num % 2 == 0);
        List<Integer> lessThanTen = allMatches(nums, (num) -> num < 10);
        List<Integer> greaterThanTwelve = allMatches(nums, (num) -> num > 12);
        System.out.println(evenNumbers);
        System.out.println(lessThanTen);
        System.out.println(greaterThanTwelve);
    }

    public static <T> List<T> allMatches(List<T> list, Predicate<T> pred) {
        List<T> newList = new ArrayList<T>();
        for (T s : list) {
            if (pred.test(s)) {
                newList.add(s);
            }
        }
        return newList;
    }
}
