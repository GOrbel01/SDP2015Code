import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;

/**
 * Created by Squall on 20/01/2015.
 */
@Data
public class Person {
    private String firstName;
    private String lastName;
//    private Address address;
    private int age;
    private String gender;

}
