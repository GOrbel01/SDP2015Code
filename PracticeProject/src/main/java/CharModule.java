import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Squall on 30/03/2015.
 */

@Module(complete = false, library = true)
public class CharModule {
    @Provides FighterCharacter providesFighterCharacter(String name, int strength) {
        return new Fighter(name, strength);
    }
}
