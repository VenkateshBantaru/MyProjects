package com;

import java.util.Scanner;

import customexception.InavlidChoiceException;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

			System.out.println("Welcome to XYZ Departmental store");
			System.out.println("**********************************");
			
			DepartmentalStore store = new DepartmentalStoreImpl();
			store.addProduct();
			
			int choice=1;
			
			while(choice==1) {
				store.displayProduct();
				store.buyProduct();
			
				System.out.println("Press 1 to continue shopping or any other num to checkout");
				choice =scan.nextInt();
			}
			store.checkout();
			
			}
		}
	
