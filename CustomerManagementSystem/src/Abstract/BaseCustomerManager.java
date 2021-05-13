package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
	
	public void save(Customer customer) throws Exception {
		System.out.println("Validation successful. Customer saved to db: " +
				customer.getFirstName() +  " " + customer.getLastName());
	}
	
}