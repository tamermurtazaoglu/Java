package interfaces2;

public class MySqlCustomerDal implements CustomerDal{
	
	@Override
	public void add() {
		System.out.println("Customer added to MySql Db");		
	}
	
}
