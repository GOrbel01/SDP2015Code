package lambdaA;

/**
 * Created by Squall on 31/03/2015.
 */
@FunctionalInterface
public interface TwoElementPredicate<T> {
    boolean testElements(T e1, T e2);
}
