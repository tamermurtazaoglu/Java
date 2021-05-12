package innerclassAndStatic;

public class ProductValidator {
	
	static boolean isValid(Product product) {
		if (product.price >= 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}