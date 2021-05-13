package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService; 
	}
	
	@Override
	public void save(Customer customer) throws Exception {
		if (customerCheckService.checkIfRealPerson(customer))  {
			super.save(customer);
		} else {
			throw new Exception("Not a valid person");
		}	
	}
	
}