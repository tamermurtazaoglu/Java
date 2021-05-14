package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerServiceAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,2,"Apple",12,50);
		// ToDo: Improve with Spring IoC
		ProductService productService = new ProductManager(new AbcProductDao(),
				new JLoggerServiceAdapter());
		productService.add(product);

	}

}