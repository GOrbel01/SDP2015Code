import dagger.Lazy;
import dagger.ObjectGraph;

import javax.inject.Inject;

/**
 * Created by Squall on 30/03/2015.
 */
public class RunTest implements Runnable {
    @Inject FightSimulator fs;

    @Override public void run() {
        fs.fight();
    }

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new CharGenModule());
        RunTest charTest = objectGraph.get(RunTest.class);
        charTest.run();
    }
}
