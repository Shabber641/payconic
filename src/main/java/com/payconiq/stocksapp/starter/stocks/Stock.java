package com.payconiq.stocksapp.starter.stocks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stock {
	
	private int id;
	private String name;
	private int currentPrice;
    private String currentTimeStamp;
    
    public Stock(int id, String name, int currentPrice,String currentTimeStamp) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currentPrice;
		this.currentTimeStamp = currentTimeStamp;
	}
    
	public Stock() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}


	public String getCurrentTimeStamp() {
		return currentTimeStamp;
	}

	public void setCurrentTimeStamp(String currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}
	
	
    
    
    
    
}
