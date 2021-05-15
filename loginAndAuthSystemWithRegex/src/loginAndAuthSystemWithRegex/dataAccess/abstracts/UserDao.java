package loginAndAuthSystemWithRegex.dataAccess.abstracts;

import loginAndAuthSystemWithRegex.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	void logout(User user);
}
