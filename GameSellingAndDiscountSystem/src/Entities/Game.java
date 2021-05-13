package Entities;

public class Game {

	int id;
	String name;
	String description;
	String producer;	
	double price;
	
	public Game(int id, String name, String description, String producer, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.producer = producer;
		this.price = price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
