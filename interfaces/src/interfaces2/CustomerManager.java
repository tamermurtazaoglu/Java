package interfaces2;

public class CustomerManager {
	
	CustomerDal[] customerDals;
	public CustomerManager(CustomerDal[] customerDals) {
		this.customerDals = customerDals;
	}
	void add() {
		for (CustomerDal customerDal : customerDals) {
			customerDal.add();
		}
	}
}
