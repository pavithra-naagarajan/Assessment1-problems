package material;

import stock.Inventory;

public class Accessories extends Inventory {
	int low = 3;
	int quantity = 1000;
	String accname;
	int cost;

	public Accessories(String accname, int cost) {
		super();
		this.lowOrderLevelQuantity = low;
		this.quantity = quantity;
		this.accname = accname;
		this.cost = cost;
	}

	public Accessories() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Accessories [lowOrderLevelQuantity=" + lowOrderLevelQuantity + ", quantity=" + quantity + ", accname=" + accname + ", cost=" + cost + "]";
	}

	public int getLowOrderLevelQuantity() {
		return lowOrderLevelQuantity;
	}

	public void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void out(int n) {
		
		if (n < quantity && n > lowOrderLevelQuantity)
			System.out.println("Order is Placed");
		else if (n < lowOrderLevelQuantity)
			System.out.println("request is sent for getting that Material");
		else {
			System.out.println("Item is not available");
		}

	}
}