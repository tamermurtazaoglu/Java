package interfaces2;

public class Main {

	public static void main(String[] args) {
		
		CustomerDal oracleCustomerDal = new OracleCustomerDal();
		CustomerDal mySqlCustomerDal = new MySqlCustomerDal();
		CustomerDal[] customerDals = {oracleCustomerDal, mySqlCustomerDal};
		
		CustomerManager customerManager = new CustomerManager(customerDals);
		customerManager.add();
		
	}

}
