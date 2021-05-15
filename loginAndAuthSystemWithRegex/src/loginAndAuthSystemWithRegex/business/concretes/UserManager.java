package loginAndAuthSystemWithRegex.business.concretes;

import java.util.ArrayList;
import java.util.List;

import loginAndAuthSystemWithRegex.business.abstracts.UserService;
import loginAndAuthSystemWithRegex.business.abstracts.ValidateService;
import loginAndAuthSystemWithRegex.core.abstracts.RegisterService;
import loginAndAuthSystemWithRegex.core.concretes.GoogleRegisterServiceAdapter;
import loginAndAuthSystemWithRegex.dataAccess.abstracts.UserDao;
import loginAndAuthSystemWithRegex.entities.concretes.User;

public class UserManager implements UserService {

	ValidateService valiadteService;
	UserDao userDao;
	EmailVerificationManager emailVerificationManager;
	RegisterService registerService;
	
	List<User> users = new ArrayList<User>();  // users are temporarily stored
	User userByRegisterService;

	public UserManager(UserDao userDao, ValidateService validateService, EmailVerificationManager emailVerificationManager, RegisterService registerService) {
		super();
		this.userDao = userDao;
		this.valiadteService = validateService;
		this.emailVerificationManager = emailVerificationManager;
		this.registerService = registerService;
	}
	
	@Override
	public void register(User user) {
		
		if( !findEmail(user.getEmail())) {
			if(valiadteService.validateEmail(user.getEmail()))
			{
				if( user.getPassword().length() >= 6 && user.getFirstName().length() >= 2 && user.getLastName().length() >= 2  )
				{
					emailVerificationManager.sendVerificationMail(user);
					if(emailVerificationManager.verify(user))
					{
						userDao.register(user);			
						users.add(user);
						return;
					}
				}
				else
				{
					System.out.println("Registration failed but name/firstname is must be min. 3 characters and password min. 5 characters.");
				}
			}
			else
			{
				System.out.println("Registration failed but mail adress is not valid.");
			}
		}
		else {
			System.out.println("Registration failed but e-mail address is already registered.");
		}
	}
	
	public boolean findEmail(String email) {
		for (User user : users) {
			if(user.getEmail() == email) return true;
		}
		return false;
		
	}

	@Override
	public void login(String email, String password) {
		for (User user : users) {
			if(user.getEmail() == email && user.getPassword() == password)
			{
				userDao.login(user);
				return;
			}
		}
		System.out.println("Login unsuccessful, email or password is not true.");	
	}

	@Override
	public void logout(User user) {
		for (User userx : users) {
			if(user == userx) {
				userDao.logout(user);	
				users.remove(user);
				return;
			}
		}
		System.out.println("Logout error: This user did not logged in.");
	}

	@Override
	public void registerWithService(User user) {
		registerService.register(user);
		users.add(user);
	}



}
