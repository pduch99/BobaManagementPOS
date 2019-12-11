package Boba;

public class Drinks {
	private String Name;
	private Double Price;
	@Override public String toString() {
		return "Item: " + Name + "  " + "Price: " + Price + "\n";
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	public void setPrice(Double Price) {
		this.Price = Price;
	}
	public Double getPrice() {
		return Price;
	}
	
	public Drinks(String Name, Double Price){
		  this.Name = Name;
		  this.Price = Price;
		  }
	
	
}

