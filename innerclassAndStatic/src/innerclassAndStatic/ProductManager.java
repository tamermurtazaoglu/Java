package innerclassAndStatic;

public class ProductManager {
	
	void add(Product product) {
		if (ProductValidator.isValid(product)) {
			System.out.println("Product added.");
		} else {
			System.out.println("Product can't added but this is not valid.");
		}
	}
}
