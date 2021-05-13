package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public class GameManager extends GameService {
	
	@Override
	public void sell(Game game, Gamer gamer) {
		super.sell(game, gamer);
	}
	
	@Override
	public void sell(Game game, Gamer gamer, Offer offer) {
		super.sell(game, gamer, offer);
	}

}
