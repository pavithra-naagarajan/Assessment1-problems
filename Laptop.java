package material;

import stock.Inventory;

public class Laptop extends Inventory {
	int quantity = 1000;
	int lowOrderLevelQuantity = 3;
	
	String name;

	public Laptop() {
		super();
		this.quantity = quantity;
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
		
		this.name = name;
	}

	
	public Laptop(String string) {
		
	}

	@Override
	public String toString() {
		return "Lapi [quantity=" + quantity + ", lowOrderLevelQuantity=" + lowOrderLevelQuantity + ", name=" + name + "]";
	}

	public void out(int quantityval) {
		if ( quantityval < quantity &&  quantityval > lowOrderLevelQuantity)
			System.out.println("Order is Placed");
		else if ( quantityval < lowOrderLevelQuantity)
			System.out.println("Sent a request for getting that Material");
		else {
			System.out.println("Item is not available");
		}
	}
}