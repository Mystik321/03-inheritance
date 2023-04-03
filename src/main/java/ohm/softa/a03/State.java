package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    public static final Logger logger = LogManager.getLogger();
    private int t = 0;
    private final int duration;

    public State(int duration) {
        this.duration = duration;
    }

    public int getTime() {
        return t;
    }

    public int getDuration() {
        return duration;
    }

    public abstract State successor(Cat c);

    public State tick(Cat cat) {
        State.logger.info("tick()");
        t = t + 1;

        if (t >= duration)
            return successor(cat);

        else
            return this;
    }
}
