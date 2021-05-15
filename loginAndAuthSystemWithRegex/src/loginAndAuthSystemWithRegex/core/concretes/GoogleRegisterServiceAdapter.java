package loginAndAuthSystemWithRegex.core.concretes;

import loginAndAuthSystemWithRegex.core.abstracts.RegisterService;
import loginAndAuthSystemWithRegex.entities.concretes.User;
import loginAndAuthSystemWithRegex.googleRegisterServiceReference.GoogleRegisterServiceManager;

public class GoogleRegisterServiceAdapter implements RegisterService {

	@Override
	public void register(User user) {
		
		GoogleRegisterServiceManager googleRegisterServiceManager = new GoogleRegisterServiceManager();
		boolean registration = googleRegisterServiceManager.registerUserFromGoogle(user.getEmail(), user.getPassword());
		if(registration) {
			System.out.println("Registration with Google successful!");			
		}else {
			System.out.println("Registration with Google failed.");
		}
		
	}
	
}
