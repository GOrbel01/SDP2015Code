import dagger.Lazy;
import dagger.Module;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Squall on 30/03/2015.
 */
public class FightSimulator {

    List<FighterCharacter> fighters;
    @Inject FighterCharacter fighter;


    public FightSimulator() {
       fighters = new ArrayList<FighterCharacter>();
    }

    public void fight() {
        Scanner sc = new Scanner(System.in);
        boolean fighting = true;
        while (fighting) {
            System.out.println("Fighting");
            if (sc.nextLine().equals("-1")) {
                fighting = false;
            }
            else
            {
                setupPlayer();
            }
        }
    }

    private void setupPlayer() {
//        setupChar();
        fighters.add(fighter);
        printList(fighters);
    }

//    public void setupChar() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Name");
//        name = sc.nextLine();
//        System.out.println("Enter Strength");
//        strength = sc.nextInt();
//    }

    private void printList(List<FighterCharacter> list) {
        for (FighterCharacter fc : list) {
            System.out.println(fc.getName());
            System.out.println(fc.getStrength());
        }
    }
}
