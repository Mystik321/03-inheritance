package ohm.softa.a03;

import ohm.softa.a03.states.*;

public class Cat {
	private final int sleep;
	private final int awake;
	private final int digest;
	State currentState;
	private final String name;

	public Cat(String name, int sleep, int awake, int digest) {
		this.name = name;
		this.sleep = sleep;
		this.awake = awake;
		this.digest = digest;
		this.currentState = new Sleeping(sleep);
	}

	public void tick(){
		this.currentState = currentState.tick(this);
	}

	/**
	 * This would be a user interaction: feed the cat to change its state!
	 */
	public void feed(){
		if (!isHungry())
			throw new IllegalStateException("Can't stuff a cat...");

		State.logger.info("You feed the cat...");
		this.currentState = ((Hungry) currentState).feed(this);
	}

	public int getSleep() {
		return sleep;
	}

	public int getAwake() {
		return awake;
	}

	public int getDigest() {
		return digest;
	}

	public String getName() {
		return name;
	}


	public boolean isAsleep() {
		return currentState instanceof Sleeping;
	}

	public boolean isPlayful() {
		return currentState instanceof Playful;
	}

	public boolean isHungry() {
		return currentState instanceof Hungry;
	}

	public boolean isDigesting() {
		return currentState instanceof Digesting;
	}

	public boolean isDead() {
		return currentState instanceof Death;
	}

	@Override
	public String toString() {
		return name;
	}
}
