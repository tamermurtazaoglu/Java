package Concrete;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class FakeCustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		return true;
	}	

}