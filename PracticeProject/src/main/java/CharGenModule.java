import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import java.util.Scanner;

/**
 * Created by Squall on 30/03/2015.
 */

@Module(injects = RunTest.class, includes = CharModule.class)
public class CharGenModule {

    @Inject String name;
    @Inject int strength;

    @Provides String provideName() {
        return name;
    }
    @Provides int provideStrength() {
        return strength;
    }
}
