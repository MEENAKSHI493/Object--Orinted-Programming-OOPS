package com.Bridgelabz1;

import java.util.Scanner;

public class StockAccountMain {
	public static void main(String[] args) {

		StockAccountManagement stockservice = new StockAccountManagement() {
			
			@Override
			public void sellStocks(int count, String symbol) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void removeStock(String name) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void getStockDetails() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calculateShareValue() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void buyStocks(int count, String symbol) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addStocks(Stocks share) {
				// TODO Auto-generated method stub
				
			}
		};
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to Stock management");
		System.out.println("Enter the num of shares to add");
		int numOfShares = scanner.nextInt();

		for (int index = 0; index < numOfShares; index++) {

			Stocks newItem = new Stocks();

			System.out.println("Enter Share name: ");
			newItem.setShareName(scanner.next());
			System.out.println("Enter share Price: ");
			newItem.setSharePrice(scanner.nextDouble());
			System.out.println("Enter no. of share taken: ");
			newItem.setShareCount(scanner.nextDouble());
			stockservice.addStocks(newItem);
		}
		stockservice.getStockDetails();

		System.out.println("Press \n1.Print Stocks  \n2.Calculate the value \n3.Remove stock \n4.Add \n5.Buy ");
		int key = scanner.nextInt();
		switch (key) {
		case 1:
			stockservice.getStockDetails();
			break;
		case 2:
			stockservice.calculateShareValue();
			break;
		case 3:
			System.out.println("Enter stock name to remove");
			String shareName = scanner.next();
			stockservice.removeStock(shareName);
			stockservice.getStockDetails();
			break;
		case 4:
			System.out.println("Enter the num of shares to add: ");
			int numOfShare = scanner.nextInt();

			for (int index = 0; index < numOfShare; index++) {

				Stocks newShares = new Stocks();

				System.out.println("Enter Share name: ");
				newShares.setShareName(scanner.next());
				System.out.println("Enter share Price: ");
				newShares.setSharePrice(scanner.nextDouble());
				System.out.println("Enter no. of share taken: ");
				newShares.setShareCount(scanner.nextDouble());
				stockservice.addStocks(newShares);
			}
			stockservice.getStockDetails();
			break;
		case 5:
			System.out.println("Choose which stock you want to buy");
			System.out.println("1.Stocks Name=idea, Price=55.0 ");
			System.out.println("2.Stocks Name=airtel, Price=44.44 ");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				Stocks buyShare = new Stocks();
				buyShare.setShareName("idea");
				buyShare.setSharePrice(55);
				System.out.println("enter the no of shares to buy");
				buyShare.setShareCount(scanner.nextDouble());
				break;
			case 2:
				Stocks buyShares = new Stocks();
				buyShares.setShareName("airtel");
				buyShares.setSharePrice(44.44);
				System.out.println("enter the no of shares to buy");
				buyShares.setShareCount(scanner.nextDouble());
				break;

			}
			break;

		}

	}
}
