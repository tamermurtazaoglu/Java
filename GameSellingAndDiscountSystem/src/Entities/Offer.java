package Entities;

public class Offer {
	
	int id;
	String name;
	double discountPercent;
	double discountAmount;
	
	
	public Offer(int id, String name, double discountPercent, double discountAmount) {
		super();
		this.id = id;
		this.name = name;
		this.discountPercent = discountPercent;
		this.discountAmount = discountAmount;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	
}
