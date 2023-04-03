package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class Hungry extends State {


    public Hungry(int duration) {
        super(duration);
    }

    @Override
    public State successor(Cat c) {
        logger.info("I've been starving for a too long time...");
        return new Death();
    }

    public State feed(Cat cat){
        logger.info("Om nom nom...");
        return new Digesting(cat.getDigest(), getDuration() - getTime());
    }
}
