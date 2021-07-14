package com.Bridgelabz1;

import java.util.LinkedList;		

public class StockAccountManagementImpl implements StockAccountManagement{

	LinkedList<Stocks> sharesList = new LinkedList<Stocks>();
	
	//method to Add Stocks

	public void addStocks(Stocks share) {
		if (sharesList.contains(share)) {
			System.err.println("Inventory Item Exists");
		}
		else {
		sharesList.add(share);
		}
		
	}

	//method to get details of stocks
	
	public void getStockDetails() {
		for (Stocks stocks : sharesList) {
			System.out.println(stocks);
		}		
	}

	
	public void calculateShareValue()
	{
		double totalvalue = 0;
		for (Stocks stocks : sharesList)
		{
			double value = stocks.getShareCount() *stocks.getSharePrice();
			System.out.println("Value of "+stocks.getShareName()+" is "+value);
			totalvalue = totalvalue + value;
		}
		System.out.println("Total value is: "+totalvalue);
	}

	
	public void removeStock(String shareName) {
		for (Stocks stocks : sharesList) {
			if(stocks.getShareName().equals(shareName))
			{
				stocks.setShareCount(0);
				stocks.setShareName(null);
				stocks.setSharePrice(0);
				
			}		
		}
		
	}


	public void sellStocks(int count, String symbol) {
		
		
	}


	public void buyStocks(int count, String symbol) {
		
		
	}
		
}