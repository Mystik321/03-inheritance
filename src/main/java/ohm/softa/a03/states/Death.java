package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class Death extends State {

    public Death() {
        super(Integer.MAX_VALUE);
    }

    @Override
    public State successor(Cat c) {
        return this;
    }
}
