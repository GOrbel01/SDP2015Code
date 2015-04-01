package lambdaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Squall on 01/04/2015.
 */
public class ListTransform {
    public static void main(String[] args) {
        String[] arrs = new String[]{"Str", "Gone", "Hippo", "Stronger", "Sharp", "Hi", "Do", "The"};
        Integer[] iarrs = new Integer[]{1, 5, 7, 3, 22, 8, 9, 12, 15, 16};
        List<String> words = Arrays.asList(arrs);
        List<Integer> nums = Arrays.asList(iarrs);
        List<String> excitingWords = transFormedList(words, (s) -> s + "!");
        List<Integer> numsTimesTen = transFormedList(nums, (num) -> num * 10);
//        List<String> newList = transFormedList(words, String::toUpperCase);
//        List<String> eyeWords = transFormedList(words, (s) -> s.replace("r", "Reggis"));
        System.out.println(excitingWords);
        System.out.println(numsTimesTen);
    }

    public static <T> List<T> transFormedList(List<T> elements, ListFunction<T> func) {
        List<T> newList = new ArrayList<T>();
        for (T s : elements) {
            newList.add(func.transform(s));
        }
        return newList;
    }
}
