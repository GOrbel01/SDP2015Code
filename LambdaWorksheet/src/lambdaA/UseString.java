package lambdaA;

/**
 * Created by Squall on 31/03/2015.
 */
public class UseString {

    public static void main(String[] args) {
        String t = betterEntry("Hello", "Goddamit", ((s1, s2) -> s1.length() > s2.length()));
        String test = betterEntry("Hello", "Goddamit", (s1, s2) -> true);
        Integer num = betterEntry(1, 4, (i1, i2) -> i1 > i2);
        Person pers = betterEntry(new Person(12), new Person(14),(p1, p2) -> p1.getAge() > p2.getAge());
        System.out.println(t);
        System.out.println(test);
        System.out.println(num);
        System.out.println(pers.getAge());
    }

    public static <T> T betterEntry(T s1, T s2, TwoElementPredicate<T> ts) {
        return ts.testElements(s1, s2) ? s1 : s2;
    }
}
