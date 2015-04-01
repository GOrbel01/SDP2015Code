package lambdaB;

import java.util.List;

/**
 * Created by Squall on 01/04/2015.
 */
@FunctionalInterface
public interface ListFunction<T> {
    T transform(T e1);
}
