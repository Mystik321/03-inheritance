package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class Sleeping extends State {

    public Sleeping(int duration) {
        super(duration);
    }

    @Override
    public State successor(Cat c) {
        return new Hungry(c.getAwake());
    }
}
