import dagger.Module;
import dagger.Provides;

/**
 * Created by Cloud on 29/03/2015.
 */

@Module(complete = false, library = true)
class PumpModule {
    @Provides Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
