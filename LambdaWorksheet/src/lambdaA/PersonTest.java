package lambdaA;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Squall on 31/03/2015.
 */
public class PersonTest {
    public static void main(String[] args) {
        PersonTest pt = new PersonTest();
        pt.launch();
    }

    private void launch() {
        Person[] people = new Person[]{new Person(34), new Person(21), new Person(34), new Person(25), new Person(25), new Person(54)};
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int num = 0;
                if (p1.getAge() < p2.getAge()) {
                    num = -1;
                }
                else if (p1.getAge() == p2.getAge()) {
                    num = 0;
                }
                else {
                    num = 1;
                }
                System.out.println("NUM: " + num);
//                p1.getAge() < p2.getAge() ? num = -1 : p1.getAge() == p2.getAge() ? num = 0 : num = 1;
                return num;
            }
        });
        Arrays.asList(people).forEach((p) -> System.out.println(p.getAge()));

    }

}
