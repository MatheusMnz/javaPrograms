package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>  {
	private int number;
	private List<T> numbers = new ArrayList<>();
	
	
	public PrintService() {
	}


	public void addValue(T number){
		numbers.add(number);
	}
	
	public 	T first() {
		if(numbers.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		else {
			return numbers.get(0);
		}
	}
	
	public void print() {
		System.out.print("[");
		if(!numbers.isEmpty()) {
			for(int i = 0; i < numbers.size(); i++) {
				if(i == numbers.size()-1) {
					System.out.print(numbers.get(i));
				}
				else {
					System.out.print(numbers.get(i) + ", ");
				}
			}
		}
		System.out.print("]\n");
	}


	
	
	public int getNumber() {
		return number;
	}
	


	public void setNumber(int number) {
		this.number = number;
	}
	

}
