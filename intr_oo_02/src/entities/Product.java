package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		//This é uma palavra reservada que significa uma autoreferência.
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $"
				//Formatando para duas casas decimais
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f",totalValueInStock());
	}
	
}
