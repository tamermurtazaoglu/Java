package abstractClasses;

public abstract class GameCalculator {
	public abstract void calc();
	public final void gameOver() {
		System.out.println("Game over.");
	}
}
