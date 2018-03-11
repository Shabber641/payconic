package com.payconiq.stocksapp.starter.stocks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StocksService {

	private List<Stock> stocks = new ArrayList<>(Arrays.asList(new Stock(1,"Bitcoin",10000, LocalDateTime.now().toString()),
			new Stock(2,"Litecoin",200,LocalDateTime.now().toString()),
			new Stock(3,"Etherium",800,LocalDateTime.now().toString())));
	
	public List<Stock> getAllStocks(){
			return stocks;
	}
	
	public Stock getStocks(int id){
		
		for(int i=0;i<stocks.size();i++) {
			Stock stock = stocks.get(i);
			if(stock.getId() == id) 
				return stock;
		}
		return null;
	}

	public void addStocks(Stock stock) {
		stocks.add(stock);
		
	}

	public void updateStock(Stock stock, int id) {
		
		for(int i=0;i<stocks.size();i++) {
			if(stocks.get(i).getId() == id) {
				stocks.set(i, stock);
				return;
			}
		}
	}
	public void deleteStocks(int id){
		for(int i=0;i<stocks.size();i++) {
			if(stocks.get(i).getId() == id) {
				stocks.remove(i);
				return;
			}
		}
	}
}
