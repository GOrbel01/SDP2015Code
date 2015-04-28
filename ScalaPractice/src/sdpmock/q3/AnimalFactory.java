package sdpmock.q3;

interface Animals {}

class Doggy implements Animals {}
class Catty implements Animals {}

public class AnimalFactory {
    public static Animals newInstance(String str) {
        if (str.equals("cat")) return new Catty();
        if (str.equals("dog")) return new Doggy();
        throw new IllegalArgumentException();
    }
}
