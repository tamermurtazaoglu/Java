package extraWork;

public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFullname() + " registered.");
	}
	
	public void registerMultiply(User[] users) {		
		for (User user : users) {
			System.out.println(user.getFullname() + " registered.");
		}
	}
	
	public void login(User user) {
		System.out.println(user.getFullname() + " signed in.");
	}

	public void logout(User user) {
		System.out.println(user.getFullname() + " signed out.");
	}

}
