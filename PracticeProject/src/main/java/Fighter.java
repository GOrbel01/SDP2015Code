import javax.inject.Inject;

/**
 * Created by Squall on 30/03/2015.
 */
public class Fighter implements FighterCharacter {
    private String name;
    private int strength;

    @Inject
    public Fighter(String name, int strength) {
        this.name = name;
        this.strength = strength;
//        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
//
//    public int getHealth() {
//        return health;
//    }
}
