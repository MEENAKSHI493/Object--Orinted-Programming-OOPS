package com.Bridgelabz;

import java.util.Scanner;

public class InventoryManagementMain {

	public static void main(String[] args) {
		InventoryManagementServiceImpl inventoryService = new InventoryManagementServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to Inventory management");
		System.out.println("Enter the num of items to add: ");
		int numOfItems = scanner.nextInt();
		
		for (int index = 0; index < numOfItems; index++) {
			
			Items newItem = new Items();
			
			System.out.println("Enter item name: ");
			newItem.setItemName(scanner.next());
			System.out.println("Enter item weight: ");
			newItem.setItemWeight(scanner.nextDouble());
			System.out.println("Enter item price per Kg: ");
			newItem.setItemPricePerKg(scanner.nextDouble());	
			inventoryService.addInventoryItem(newItem);
		}
		inventoryService.getInventoryDetails();
		System.out.println("Enter name of the item to be found: ");
		String itemName = scanner.next();
		inventoryService.getInventoryDataByName(itemName);
		inventoryService.calculateInventoryItemValue();
	}



	}

