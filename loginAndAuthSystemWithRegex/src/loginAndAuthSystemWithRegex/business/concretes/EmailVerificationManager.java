package loginAndAuthSystemWithRegex.business.concretes;

import loginAndAuthSystemWithRegex.business.abstracts.EmailVerificationService;
import loginAndAuthSystemWithRegex.entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public boolean verify(User user) {
		return true;
	}

	@Override
	public void sendVerificationMail(User user) {
		System.out.println("Verification mail sent to: " + user.getEmail());
	}

}
