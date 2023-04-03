package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class Playful extends State {


    public Playful(int duration) {
        super(duration);
    }

    @Override
    public State successor(Cat c) {
        logger.info("Yoan... getting tired!");
        return new Sleeping(c.getSleep());
    }
}
