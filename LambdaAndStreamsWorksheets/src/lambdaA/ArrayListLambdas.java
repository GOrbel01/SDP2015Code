package lambdaA;

import java.util.Arrays;

/**
 * Created by Squall on 31/03/2015.
 */
public class ArrayListLambdas {
    public static void main(String[] args) {
        ArrayListLambdas all = new ArrayListLambdas();
        all.launch();
    }

    public void launch() {
        String[] testStrings = new String[]{"For", "Gone", "Fa", "egg", "Dom", "Incubator", "Batornam", "extra", "eccentric"};
        Arrays.sort(testStrings,(s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.asList(testStrings));
        Arrays.sort(testStrings, (s1, s2) -> s2.length() - s1.length());
        System.out.println(Arrays.asList(testStrings));
        Arrays.sort(testStrings, (s1, s2) -> Character.toUpperCase(s1.charAt(0)) - Character.toUpperCase(s2.charAt(0)));
        System.out.println(Arrays.asList(testStrings));
        Arrays.sort(testStrings, (s1, s2) -> s2.charAt(0) - 'e');
        System.out.println(Arrays.asList(testStrings));
    }
}
