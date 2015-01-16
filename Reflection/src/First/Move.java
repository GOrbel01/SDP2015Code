package First;

/**
 * Created by Squall on 15/01/2015.
 */
public class Move {
    private String name;

    public Move()
    {

    }

    public Move(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String concatenateName(String addTo)
    {
        return ("" + name + addTo);
    }

}
