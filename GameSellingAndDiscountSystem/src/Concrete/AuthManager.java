package Concrete;

import Abstract.AuthService;
import Entities.Gamer;

public class AuthManager extends AuthService {
	
	@Override
	public boolean auth(Gamer gamer) {
		return super.auth(gamer);
	}
	
	
}
