package com.payconiq.stocksapp.starter.stocks;


import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import com.payconiq.stocksapp.starter.stocks.Stock;

@RestController
public class StocksController {
	
	@Autowired
	private StocksService stocksService;
	
	@RequestMapping("/stocks")
	public List<Stock> getAllStocks(Model model){
			return stocksService.getAllStocks();
	//	model.addAttribute("stocks",stocksService.getAllStocks());
	//	return "stocks";
	}
	
	@RequestMapping("/stocks/{id}")
	public Stock getStock(@PathVariable int id) {
			return stocksService.getStocks(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/stocks")
	public void addStocks(@RequestBody Stock stock) {
		stocksService.addStocks(stock);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/stocks/{id}")
	public void updateStocks(@RequestBody Stock stock, @PathVariable int id) {
		stocksService.updateStock(stock,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/stocks")
    public void deleteStocks(int id){
        stocksService.deleteStocks(id);
    }

}


