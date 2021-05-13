package Abstract;

import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public abstract class GameService {
	public void sell(Game game, Gamer gamer, Offer offer) {
		System.out.println(game.getName() + " buyed by " + gamer.getNickname() + " with \"" + offer.getName()
		+ "\" offer!" );
	}
	
	public void sell(Game game, Gamer gamer) {
		System.out.println(game.getName() + " buyed by " + gamer.getNickname() + "!");
	}
}
