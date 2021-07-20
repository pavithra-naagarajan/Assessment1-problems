package material;

import java.util.Scanner;

public class OrderPlaced {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("lenovo");
		Laptop l2 = new Laptop("Apple");
		Laptop l3=new Laptop("hasee");
		
		
		Accessories a1 = new Accessories("Bags", 2000);
		Accessories a2 = new Accessories("Shoes", 2500);
		Accessories a3 = new Accessories("Sunglasses", 1000);
		Accessories a4 = new Accessories("Watch", 4000);
		System.out.println("Enter your choice Laptop/Accessories: press L for laptop or press A for  Accessories:");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		System.out.println("Enter the number of quantities : ");
		int quantity = sc.nextInt();
		switch (i) {
		case "L":
			Laptop o = new Laptop();
			o.out(quantity);
			break;
		case "A":
			Accessories o2 = new Accessories();
			o2.out(quantity);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
	}

}