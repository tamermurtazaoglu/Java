package loginAndAuthSystemWithRegex;

import loginAndAuthSystemWithRegex.business.abstracts.UserService;
import loginAndAuthSystemWithRegex.business.concretes.EmailVerificationManager;
import loginAndAuthSystemWithRegex.business.concretes.RegexValidateManager;
import loginAndAuthSystemWithRegex.business.concretes.UserManager;
import loginAndAuthSystemWithRegex.core.concretes.GoogleRegisterServiceAdapter;
import loginAndAuthSystemWithRegex.dataAccess.concretes.HibernateUserDao;
import loginAndAuthSystemWithRegex.entities.concretes.User;
import loginAndAuthSystemWithRegex.googleRegisterServiceReference.GoogleRegisterServiceManager;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernateUserDao(), new RegexValidateManager(), new EmailVerificationManager(), new GoogleRegisterServiceAdapter());

		User user1 = new User(1, "Tamer", "Murtazaoglu", "contact@tamerm.com", "123456");
		User user2 = new User(1, "Tamer", "Murtazaoðlu", "contact@tamerm.com", "123456");
		User user3 = new User(1, "Engin", "Demirog", "x", "123456");
		User user4 = new User(1, "John", "D", "contact@j.com", "123456");
		User googleUser = new User(1,"Tamer", "Murtazaoglu", "tamermurtazaoglu@gmail.com", "1234567890");
		
		userService.register(user1);
		System.out.println("-----");
		userService.register(user2);
		System.out.println("-----");
		userService.register(user3);
		System.out.println("-----");
		userService.register(user4);
		System.out.println("-----");
		userService.login("not_valid@user.com","123456");
		System.out.println("-----");
		userService.login("contact@tamerm.com","123456");
		System.out.println("-----");
		userService.logout(user1);
		System.out.println("-----");
		userService.logout(user1);
		System.out.println("-----");
		userService.registerWithService(googleUser);
		System.out.println("-----");
		userService.login("tamermurtazaoglu@gmail.com", "1234567890");
		System.out.println("-----");
		userService.logout(googleUser);
		
	}

}
