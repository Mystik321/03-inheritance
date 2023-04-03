package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class Digesting extends State {

    private final int remainingWakeTime;
    public Digesting(int duration, int remainingWakeTime) {
        super(duration);
        this.remainingWakeTime = remainingWakeTime;
    }

    @Override
    public State successor(Cat c) {
        return new Playful(remainingWakeTime - c.getDigest());
    }
}
