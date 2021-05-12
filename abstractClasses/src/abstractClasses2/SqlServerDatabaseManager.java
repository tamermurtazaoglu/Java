package abstractClasses2;

public class SqlServerDatabaseManager extends BaseDatabaseManager {
	@Override
	public void getData() {
		System.out.println("Data fetched: SQL server");
	}
}
