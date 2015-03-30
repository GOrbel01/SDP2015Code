import dagger.Lazy;

import javax.inject.Inject;

/**
 * Created by Cloud on 29/03/2015.
 */
public class CoffeeMaker {
    @Inject Lazy<Heater> heater;
    @Inject Pump pump;

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.get().off();
    }
}
