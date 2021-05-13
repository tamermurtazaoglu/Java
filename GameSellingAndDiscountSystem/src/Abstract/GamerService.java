package Abstract;

import Entities.Gamer;

public interface GamerService {
	void update(Gamer gamer);
	void delete(Gamer gamer);
	void register(Gamer gamer);
}
