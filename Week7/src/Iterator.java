import java.util.Arrays;
import java.util.List;

/**
 * Created by Squall on 03/03/2015.
 */
public class Iterator {
    public static void main(String[] args)
    {
        List<String> ls = Arrays.asList("a", "b", "c");

        for (java.util.Iterator<String> il = ls.iterator(); il.hasNext();) {
            String s = il.next();
            if (s.equals("b"))
            {
                ls.remove(s);
            }
            System.out.println(s);
        }
        System.out.println(ls);

//        for(String s: ls) {
//            if (s.equals("b"))
//            {
//                ls.remove(s);
//            }
//            System.out.println(s);
//        }
//        System.out.println(ls);
    }
}
