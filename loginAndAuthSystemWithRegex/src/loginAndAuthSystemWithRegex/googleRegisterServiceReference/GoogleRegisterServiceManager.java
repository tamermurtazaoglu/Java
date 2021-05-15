package loginAndAuthSystemWithRegex.googleRegisterServiceReference;

public class GoogleRegisterServiceManager {
	
	public boolean registerUserFromGoogle(String gmail, String password) {
		if(!gmail.isEmpty() && !password.isEmpty())
		{
			return true;
		}
		return false;
	}

}
