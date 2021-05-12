package abstractClasses2;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	public void getCustomers() {
		databaseManager.getData();
	}
}
