package loginAndAuthSystemWithRegex.dataAccess.concretes;

import loginAndAuthSystemWithRegex.dataAccess.abstracts.UserDao;
import loginAndAuthSystemWithRegex.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void register(User user) {
		System.out.println("Registration successfully for this e-mail: " + user.getEmail());	
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " logged in.");
		
	}

	@Override
	public void logout(User user) {
		System.out.println(user.getFirstName() + " logged out.");
		
	}
	

}
