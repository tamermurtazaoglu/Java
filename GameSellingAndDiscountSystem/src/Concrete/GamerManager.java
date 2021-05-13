package Concrete;

import Abstract.AuthService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	AuthService authService;
	
	public GamerManager(AuthService authService) {
		this.authService = authService;
	}
	
	@Override
	public void register(Gamer gamer) {
		if(authService.auth(gamer))
		{
			System.out.println("Gamer verified and registered as  " + gamer.getNickname());				
		}
		else
		{
			System.out.println("Gamer info not verified, registration fail.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(authService.auth(gamer))
		{
			System.out.println("Gamer verified and updated as  " + gamer.getNickname());				
		}
		else
		{
			System.out.println("Gamer info not verified, update fail.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted: " + gamer.getNickname());
	}

}
