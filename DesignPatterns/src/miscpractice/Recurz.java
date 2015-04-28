package miscpractice;

/**
 * Created by Squall on 16/04/2015.
 */
public class Recurz {
    public static void main(String[] args) {
        String str = "abcde";
        procString(str);
    }

    private static void procString(String str) {
        if (str.length() > 0) {
            System.out.println(str);
            procString(str.substring(0, str.length() - 1));
            System.out.println(str);
        }
    }
}

//        if (s.length() > 1) stringRecurse(s.substring(0, s.length() - 1));