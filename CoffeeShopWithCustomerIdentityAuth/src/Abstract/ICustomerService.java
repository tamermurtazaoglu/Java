package Abstract;

import Entities.Customer;

public interface ICustomerService {
	void save(Customer customer) throws Exception;
}