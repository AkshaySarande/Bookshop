package cart;

import java.util.ArrayList;

public class Cart {

	private double total =0 ;
	private ArrayList<String> arr = new ArrayList<>();
	
	public double getTotal() {
		return total;
	}


	public ArrayList<String> getArr() {
		return arr;
	}


	public void setTotal(double price) {
		System.out.println(price);
		this.total += price;		
	}

	public void decTotal(double price) {
		System.out.println(price);
		this.total -= price;		
	}
	
	public void setArr(String s) {
		arr.add(s);
	}
	
	public void remove(String s) {
		arr.remove(s);
		
	}
	
}
