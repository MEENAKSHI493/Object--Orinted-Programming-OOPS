package com.Bridgelabz1;

public interface StockAccountManagement {
	
    public  void addStocks(Stocks share);
	public  void getStockDetails();
	public  void calculateShareValue();
	public  void removeStock(String name);
	public  void sellStocks(int count, String symbol);
	public  void buyStocks(int count, String symbol);
}
