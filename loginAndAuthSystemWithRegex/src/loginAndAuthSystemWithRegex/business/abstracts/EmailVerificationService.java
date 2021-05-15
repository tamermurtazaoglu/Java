package loginAndAuthSystemWithRegex.business.abstracts;

import loginAndAuthSystemWithRegex.entities.concretes.User;

public interface EmailVerificationService {
	void sendVerificationMail(User user);
	boolean verify(User user);
}
