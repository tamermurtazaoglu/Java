package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V14", 15000, "Lenovo Laptop with 32 GB RAM");
		Product product2 = new Product(1,"Lenovo V15", 15000, "Lenovo Laptop with 32 GB RAM");
		Product product3 = new Product(1,"Lenovo V16", 15000, "Lenovo Laptop with 32 GB RAM");
		
		Product[] products = { product1, product2, product3 };
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		System.out.println(products.length);

		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
	}

}
