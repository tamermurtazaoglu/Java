package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService = loggerService;
	}
	
	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Adding products to this category is not allowed.");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Logged!");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
