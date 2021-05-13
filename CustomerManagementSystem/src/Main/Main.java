package Main;

import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
// import Concrete.FakeCustomerCheckManager; // always return true
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); //
		// BaseCustomerManager customerManager = new StarbucksCustomerManager(new FakeCustomerCheckManager());
		try {
			customerManager.save(new Customer(1,"Tamer","Murtazaoðlu",LocalDate.of(2000,01,01),"0"));
		} catch (Exception e) {
			System.out.println("Validation unsuccessful. Customer don't saved to db.");
		}
	}

}