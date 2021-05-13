package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws RemoteException;
}
