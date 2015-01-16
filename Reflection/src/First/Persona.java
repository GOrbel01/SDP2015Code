package First;

/**
 * Created by Squall on 15/01/2015.
 */
public class Persona {
    private String name;
    private Move move;

    public Persona()
    {

    }

    public Persona(String name, Move move)
    {
        this.name = name;
        this.move = move;
    }

    public String getName()
    {
        return name;
    }

    public Move getMove()
    {
        return move;
    }

    public void recursiveFight(int count, int damage)
    {
        if (count <= 2)
        {
            System.out.println("Hit enemy " + count + " Time For " + damage + " Damage");
            recursiveFight(count + 1, damage);
        }
    }

    public void moveAndShout(String move, String shout)
    {
        System.out.println(name + " Uses Move " + move);
        System.out.println(name + " Didnt use his normal move " + this.move.getName() + " What a Knob");
        System.out.println(name + " Shouts " + shout);
    }
}
