package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customexception.InavlidChoiceException;
import customexception.InvalidQuantityException;

public class DepartmentalStoreImpl implements DepartmentalStore {

	Scanner scan = new Scanner(System.in);
	Map<Integer, Product> db = new LinkedHashMap<Integer, Product>();
	int totalBill = 0;

	@Override
	public void addProduct() {

		db.put(1, new Product("Chocalate", 10, 10));
		db.put(2, new Product("Biscuite", 20, 20));
		db.put(3, new Product("IceCream", 30, 50));

	}

	@Override
	public void displayProduct() {

		Set<Integer> keys = db.keySet();
		for (int key : keys) {
			Product p = db.get(key);
			System.out.println("Enter " + key + " to order " + p.getName());
			System.out.println("Available Quantity: " + p.getQuantity());
			System.out.println("Cost: " + p.getCost());
			System.out.println("--------------------------------------");
		}

	}

	@Override
	public void buyProduct() {
		System.out.println("Enter ur choice");
		int choice = scan.nextInt();
		Product p = db.get(choice);
		if (p != null) {
			System.out.println("Enter the Quantity:");
			int quantity = scan.nextInt();

			if (quantity <= p.getQuantity()) {
				// calculating current product cost
				int productCost = quantity * p.getCost();

				// Adding productcost to total Bill
				totalBill = totalBill + productCost;

				// updating the new quantity
				p.setQuantity(p.getQuantity() - quantity);

				System.out.println("Ordred " + quantity + " " + p.getName());
				System.out.println("Product Cost         : " + productCost);
				System.out.println("Total Bill as of now : " + totalBill);
				System.out.println("========================================");

			} else {
				try {
					String msg = "Inavlid quantity " + p.getName() + " is not Available";
					throw new InvalidQuantityException(msg);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
		} else {
			try {
				String msg = "Inavlid choice ,Plz enter valid choice";
				throw new InavlidChoiceException(msg);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void checkout() {
		System.out.println("Total Bill: Rs." + totalBill);
		System.out.println("Thank you for Shopping");
	}

}
