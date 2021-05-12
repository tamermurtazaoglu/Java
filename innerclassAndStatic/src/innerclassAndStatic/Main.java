package innerclassAndStatic;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "Laptop";
		product.price = 7500;
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();
	}

}
